package cadastro.equipamentos;

import java.util.HashMap;
import java.util.Map;

public class  CadastroEquipamento {

    // esse cara e o "Banco"
    private Map<String, Equipamento> estoque = new HashMap<>();

    // exemplo de como salvar
    public void salvar(Equipamento equipamento){
        estoque.put(equipamento.getCodigo(), equipamento);
    }

    // exemplo de como pesquisar
    public Equipamento pesquisar(String codigo){
        return estoque.get(codigo);
    }

    // demais operacões... aqui
}
