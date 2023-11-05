package modal.dao;

import conectabd.Conectabanco;
import domain.Veiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Veiculodao {
    private Connection con;
    private PreparedStatement pst;

    public Veiculodao() {
    }

    // Método para cadastrar um veículo
    public void cadastrarVeiculo(Veiculo veiculo) {
        try {
            con = Conectabanco.getConnection();
            pst = con.prepareStatement("call cadastrarveiculo(?,?,?,?,?,?);");
            pst.setString(1, veiculo.getNumero());
            pst.setString(2, veiculo.getPlaca());
            pst.setInt(3, veiculo.getMotorista().getId());
            pst.setString(4, veiculo.getModelo());
            pst.setDate(5, new java.sql.Date(veiculo.getDatacompra().getTime()));
            pst.setInt(6, veiculo.getQtdpoltronas());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Feche a conexão e o PreparedStatement aqui, se necessário.
        }
    }

    // Método para consultar um veículo por placa
    public Veiculo consultarVeiculoPorPlaca(String placa) {
        Veiculo veiculo = null;
        try {
            con = Conectabanco.getConnection();
            pst = con.prepareStatement("CALL consultarveiculo(?)");
            pst.setString(1, placa);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                veiculo = new Veiculo();
                veiculo.setPlaca(resultSet.getString("desplaca"));
                // Preencha os outros atributos do veículo aqui
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Feche a conexão e o PreparedStatement aqui, se necessário.
        }
        return veiculo;
    }

}
