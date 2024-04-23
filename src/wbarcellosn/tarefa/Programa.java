/**
 * @author winic
 */
package wbarcellosn.tarefa;

public class Programa {

    public static void main(String[] args){
        Programa task = new Programa();
        PessoaFisica pessoa1 = new PessoaFisica("João", "Rua das flores, 41","(27) 9999-88888", "123.456.789-00");
        PessoaFisica pessoa2 = new PessoaFisica("Maria", "Rua dos perdidos, 180", "(27) 9888-77235","987.654.321-00");
        PessoaJuridica empresa1 = new PessoaJuridica("Supermercado Tabajara", "Rua dos que não foram, 14", "(27) 9956-63254","12.3456.789/0001-00");
        PessoaJuridica empresa2 = new PessoaJuridica("Padaria Akitemsonho", "Avenida do pão, 29", "(27) 9872-14568","98.7654.321/0001-00");

        task.imprimeDados(pessoa1);
        task.imprimeDados(pessoa2);
        task.imprimeDados(empresa1);
        task.imprimeDados(empresa2);
    }

    public void imprimeDados(PessoaFisica pessoa){
        System.out.println("******DADOS PESSOAIS******");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("******FIM DE DADOS PESSOAIS******\n");
    }

    public void imprimeDados(PessoaJuridica empresa){
        System.out.println("******DADOS DA EMPRESA******");
        System.out.println("Nome: " + empresa.getNome());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("Telefone: " + empresa.getTelefone());
        System.out.println("Endereço: " + empresa.getEndereco());
        System.out.println("******FIM DE DADOS DA EMPRESA******\n");
    }
}
