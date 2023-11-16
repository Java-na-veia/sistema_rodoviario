package modal.dao;

import conectabd.Conexao; // Importe a classe de conexão apropriada com base no seu projeto
import domain.Veiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VeiculoDAO implements VeiculoDAOListener {
    private Connection con;
    private PreparedStatement pst;

    public VeiculoDAO() {
    }
<<<<<<< Updated upstream

    /**
     *
     * @param veiculo
     * @throws SQLException
     */
    @Override
    public void cadastrarVeiculo(Veiculo veiculo) throws SQLException {
        try {
            con = Conexao.getConnection(); 
            pst = con.prepareStatement("INSERT INTO veiculo (numero, placa, idmotorista, modelo, datacompra, qtdpoltronas) VALUES (?, ?, ?, ?, ?, ?);");
=======
    
    public ResultSet listarVeiculos() throws SQLException {
        List<Veiculo> veiculos = new ArrayList<>();
        try {
            con = Conexao.getConnection();
            pst = con.prepareStatement("SELECT desplaca FROM veiculo;");
        } catch (SQLException e) {
            throw e;
        } catch (Exception ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pst.executeQuery();
    }
    
    /**
     *
     * @param veiculo
     * @throws SQLException
     */
    @Override
    public void cadastrarVeiculo(Veiculo veiculo) throws SQLException {
        try {
            con = Conexao.getConnection(); 
            pst = con.prepareStatement("CALL cadastrarveiculo(?, ?, ?, ?, ?, ?);");
>>>>>>> Stashed changes
            pst.setString(1, veiculo.getNumero());
            pst.setString(2, veiculo.getPlaca());
            pst.setString(3, veiculo.getMotorista());
            pst.setString(4, veiculo.getModelo());
            pst.setInt(5,veiculo.getAnomodelo());
            pst.setInt(6, veiculo.getQtdpoltronas());
            pst.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } catch (Exception ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
<<<<<<< Updated upstream
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
=======
>>>>>>> Stashed changes
        }
    }

    /**
     *
     * @param placa
     * @return
     * @throws SQLException
     */
    @Override
    public Veiculo consultarVeiculoPorPlaca(String placa) throws SQLException {
        Veiculo veiculo = null;
        try {
            con = Conexao.getConnection(); 
<<<<<<< Updated upstream
            pst = con.prepareStatement("SELECT numero, placa, idmotorista, modelo, datacompra, qtdpoltronas FROM veiculo WHERE placa = ?;");
=======
            pst = con.prepareStatement("CALL consultarveiculo(?);");
>>>>>>> Stashed changes
            pst.setString(1, placa);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                veiculo = new Veiculo();
<<<<<<< Updated upstream
                veiculo.setNumero(rs.getString("numero"));
                veiculo.setPlaca(rs.getString("placa"));
                // Preencha os outros atributos do veículo aqui
=======
                veiculo.setPlaca(rs.getString("desplaca"));
                veiculo.setMotorista(rs.getString("nommotorista"));
                veiculo.setModelo(rs.getString("desmodelo"));
                veiculo.setAnomodelo(rs.getInt("nroanomodelo"));
                veiculo.setQtdpoltronas(rs.getInt("nropoltronas"));
                veiculo.setNumero(rs.getString("numero"));
>>>>>>> Stashed changes
            }
        } catch (SQLException e) {
            throw e;
        } catch (Exception ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
<<<<<<< Updated upstream
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        }
=======
        } 
>>>>>>> Stashed changes
        return veiculo;
    }

    public List<Veiculo> listarTodosVeiculos() throws SQLException {
        List<Veiculo> veiculos = new ArrayList<>();
        try {
            con = Conexao.getConnection();
<<<<<<< Updated upstream
            pst = con.prepareStatement("SELECT numero, placa, idmotorista, modelo, datacompra, qtdpoltronas FROM veiculo");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Veiculo veiculo = new Veiculo();
                veiculo.setNumero(rs.getString("numero"));
                veiculo.setPlaca(rs.getString("placa"));
                // Preencha os outros atributos do veículo aqui
=======
            pst = con.prepareStatement("SELECT desplaca, nommotorista, desmodelo, nroanomodelo, nropoltronas, numero FROM veiculo");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Veiculo veiculo = new Veiculo();
                veiculo.setPlaca(rs.getString("desplaca"));
                veiculo.setMotorista(rs.getString("nommotorista"));
                veiculo.setModelo(rs.getString("desmodelo"));
                veiculo.setAnomodelo(rs.getInt("nroanomodelo"));
                veiculo.setQtdpoltronas(rs.getInt("nropoltronas"));
                veiculo.setNumero(rs.getString("numero"));
>>>>>>> Stashed changes
                veiculos.add(veiculo);
            }
        } catch (SQLException e) {
            throw e;
        } catch (Exception ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
<<<<<<< Updated upstream
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
=======
>>>>>>> Stashed changes
        }
        return veiculos;
    }

    public void excluirVeiculoPorPlaca(String placa) throws SQLException {
        try {
            con = Conexao.getConnection(); 
<<<<<<< Updated upstream
            pst = con.prepareStatement("DELETE FROM veiculo WHERE placa = ?;");
=======
            pst = con.prepareStatement("CALL excluirveiculo(?);");
>>>>>>> Stashed changes
            pst.setString(1, placa);
            pst.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } catch (Exception ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
<<<<<<< Updated upstream
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
=======
>>>>>>> Stashed changes
        }
    }
}
