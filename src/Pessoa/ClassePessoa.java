package Pessoa;

abstract class Pessoa {
 protected String nome;
 protected String endereco;

 public Pessoa(String nome, String endereco) {
     this.nome = nome;
     this.endereco = endereco;
 }

 public abstract String obterInformacoes();
}

class PessoaJuridica extends Pessoa {
 private String cnpj;

 public PessoaJuridica(String nome, String endereco, String cnpj) {
     super(nome, endereco);
     this.cnpj = cnpj;
 }


 public String obterInformacoes() {
     return "Pessoa Jurídica: " + nome + ", " + endereco + ", CNPJ: " + cnpj;
 }
}


class PessoaFisica extends Pessoa {
 private String cpf;


 public PessoaFisica(String nome, String endereco, String cpf) {
     super(nome, endereco);
     this.cpf = cpf;
 }


 @Override
 public String obterInformacoes() {
     return "Pessoa Física: " + nome + ", " + endereco + ", CPF: " + cpf;
 }
}


public class ClassePessoa {
 public static void main(String[] args) {
     PessoaJuridica empresa = new PessoaJuridica("Empresa XYZ", "Rua Comercial, 123", "12345678901234");
     PessoaFisica pessoaFisica = new PessoaFisica("João da Silva", "Avenida Residencial, 456", "123.456.789-01");


     System.out.println(empresa.obterInformacoes());
     System.out.println(pessoaFisica.obterInformacoes());
 }
}
