package modal.dao;

import domain.Cidade;
import domain.Passagem;
import domain.Usuario;
import domain.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PassagemDAO {
    private final Connection connection;

    public PassagemDAO(Connection connection) {
        this.connection = connection;
    }

    public void cadastrarPassagem(Passagem passagem) throws SQLException {
        String sql = "INSERT INTO passagem (poltrona, datasaida, horasaida, cidadeorigem_id, cidadedestino_id, valorpassagem, usuario_id, veiculo_id) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, passagem.getPoltrona());
            preparedStatement.setDate(2, new java.sql.Date(passagem.getDatasaida().getTime()));
            preparedStatement.setString(3, passagem.getHorasaida());
            preparedStatement.setLong(4, passagem.getCidadeorigem().getIdCidade()); // Substitua 'getId()' pelo método correto para obter o ID da cidade de origem.
            preparedStatement.setLong(5, passagem.getCidadedestino().getIdCidade()); // Substitua 'getId()' pelo método correto para obter o ID da cidade de destino.
            preparedStatement.setDouble(6, passagem.getValorpassagem());
            preparedStatement.setInt(7, passagem.getUsuario().getId()); // Substitua 'getId()' pelo método correto para obter o ID do usuário.
            preparedStatement.setInt(8, passagem.getVeiculo().getId()); // Substitua 'getId()' pelo método correto para obter o ID do veículo.

            preparedStatement.executeUpdate();
        }
    }

    public Passagem consultarPassagem(int idPassagem) throws SQLException {
        String sql = "SELECT * FROM passagem WHERE idpassagem = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, idPassagem);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int idpassagem = resultSet.getInt("idpassagem");
                    int poltrona = resultSet.getInt("poltrona");
                    Date datasaida = resultSet.getDate("datasaida");
                    String horasaida = resultSet.getString("horasaida");

                    // Recupere as outras informações do banco de dados
                    int cidadeOrigemId = resultSet.getInt("cidadeorigem_id");
                    Cidade cidadeOrigem = consultarCidade(cidadeOrigemId);

                    int cidadeDestinoId = resultSet.getInt("cidadedestino_id");
                    Cidade cidadeDestino = consultarCidade(cidadeDestinoId);

                    double valorpassagem = resultSet.getDouble("valorpassagem");
                    
                    String placaVeiculo = resultSet.getString("placa");
                    Veiculo veiculo = new Veiculo(placaVeiculo);


                    return new Passagem(idpassagem, poltrona, datasaida, horasaida, cidadeOrigem, cidadeDestino, valorpassagem, veiculo);
                }
            }
        }
        return null; // Retorna null se a passagem não for encontrada.
    }

    private Cidade consultarCidade(int cidadeId) throws SQLException {
        String sql = "SELECT * FROM cidade WHERE idCidade = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, cidadeId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    Long idCidade = resultSet.getLong("idCidade");
                    String nomeCidade = resultSet.getString("nomeCidade");
                    String uf = resultSet.getString("uf");
                    return new Cidade(idCidade, nomeCidade, uf);
                }
            }
        }
        return null; // Retorna null se a cidade não for encontrada.
    }

    


    public void excluirPassagem(int idPassagem) throws SQLException {
        String sql = "DELETE FROM passagem WHERE idpassagem = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, idPassagem);
            preparedStatement.executeUpdate();
        }
    }
}
