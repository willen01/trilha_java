package _02Heranca_associacao_interface._01_Upcast_e_Downcast;

public class RodarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario= new Funcionario();

        //Upcast implicito
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //downcast -- quer transformar um funcionário em vendedor
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
