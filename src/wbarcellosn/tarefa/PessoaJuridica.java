/**
 * @author winic
 */
package wbarcellosn.tarefa;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, String endereco,String telefone, String cpf){
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
        this.cnpj = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }
}
