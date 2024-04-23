/**
 * @author winic
 */
package wbarcellosn.tarefa;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nome, String endereco,String telefone, String cpf){
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
