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
            pst.setString(1, veiculo.getNumero());
            pst.setString(2, veiculo.getPlaca());
            pst.setInt(3, veiculo.getMotorista().getId());
            pst.setString(4, veiculo.getModelo());
            pst.setDate(5, new java.sql.Date(veiculo.getDatacompra().getTime()));
            pst.setInt(6, veiculo.getQtdpoltronas());
            pst.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } catch (Exception ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
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
            pst = con.prepareStatement("SELECT numero, placa, idmotorista, modelo, datacompra, qtdpoltronas FROM veiculo WHERE placa = ?;");
            pst.setString(1, placa);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                veiculo = new Veiculo();
                veiculo.setNumero(rs.getString("numero"));
                veiculo.setPlaca(rs.getString("placa"));
                // Preencha os outros atributos do veículo aqui
            }
        } catch (SQLException e) {
            throw e;
        } catch (Exception ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return veiculo;
    }

    public List<Veiculo> listarTodosVeiculos() throws SQLException {
        List<Veiculo> veiculos = new ArrayList<>();
        try {
            con = Conexao.getConnection();
            pst = con.prepareStatement("SELECT numero, placa, idmotorista, modelo, datacompra, qtdpoltronas FROM veiculo");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Veiculo veiculo = new Veiculo();
                veiculo.setNumero(rs.getString("numero"));
                veiculo.setPlaca(rs.getString("placa"));
                // Preencha os outros atributos do veículo aqui
                veiculos.add(veiculo);
            }
        } catch (SQLException e) {
            throw e;
        } catch (Exception ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return veiculos;
    }

    public void excluirVeiculoPorPlaca(String placa) throws SQLException {
        try {
            con = Conexao.getConnection(); 
            pst = con.prepareStatement("DELETE FROM veiculo WHERE placa = ?;");
            pst.setString(1, placa);
            pst.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } catch (Exception ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
}
