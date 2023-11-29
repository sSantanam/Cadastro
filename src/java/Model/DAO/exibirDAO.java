/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;
import Model.exibir;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
public class exibirDAO {
    private List<exibir> listaExibicoes;

    public exibirDAO() {
        this.listaExibicoes = new ArrayList<>();
    }

    public void adicionarExibicao(String descricao, String valor, String tipo) {
        exibir exibir = new exibir(descricao, valor, tipo);
        listaExibicoes.add(exibir);
    }

    public List<exibir> obterTodasExibicoes() {
        return new ArrayList<>(listaExibicoes);
    }

    public exibir obterExibicaoPorDescricao(String descricao) {
        for (exibir exibir : listaExibicoes) {
            if (exibir.getdescricao().equals(descricao)) {
                return exibir;
            }
        }
        return null; // Retorna null se não encontrar a exibição com a descrição especificada
    }

    public void atualizarExibicao(String descricao, String novoValor, String novoTipo) {
        for (exibir exibir : listaExibicoes) {
            if (exibir.getdescricao().equals(descricao)) {
                exibir.setdescricao(descricao);
                exibir.setvalor(novoValor);
                exibir.setTipo(novoTipo);
                return;
            }
        }
    }

    public void removerExibicao(String descricao) {
        listaExibicoes.removeIf(exibir -> exibir.getdescricao().equals(descricao));
    }
}

