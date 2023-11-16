package modal.dao;

import domain.Cidade;

import java.sql.SQLException;
import java.util.List;

public interface CidadeDAOListener {
    void cadastrarCidade(Cidade cidade) throws SQLException;

    Cidade obterCidadePorId(Long idCidade) throws SQLException;

    List<Cidade> listarTodasCidades() throws SQLException;

    void excluirCidade(Long idCidade) throws SQLException;
}
