import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
   
    //variaveis calculo adicionais 
        double exdentegigas=0;
        double numerogigas=0;
        double exdentemoto=0;
        double numeromoto=0;
        double exdentecomprov=0;
        double numerocomprov=0;
        double Pagamentofixo=0;    
        double gigas=0;
        double Motoristas=0;
        double comprovmesusuario=0;
        String mesdereferencia = "";
        String idcontrato = "";

    //variaveis cadastro 
        double idcontratocadastro = 0;
        double cobrançafixa = 0;
        double cotagigas = 0;
        double cotamotoristas = 0;
        double cotacomprovacoes = 0;
        String nomeempresa = "";

    //Cadastro de dados (Sera enviado para um banco de dados)
        
        System.out.println("deseja Adicionar Uma Nova empresa ?");
            String cadastrodeempresa = sc.nextLine();
        
    if (cadastrodeempresa.equals("sim")){
            
            System.out.println("Digite O id do contrato");
                idcontratocadastro = sc.nextDouble();
 
                sc.nextLine();
            System.out.println("Digite o nome da Empresa");
                nomeempresa = sc.next();
                
            System.out.println("Digite o Numero de cotas de Comprovação");
                cotacomprovacoes = sc.nextDouble();

            System.out.println("Digite o Numero de cotas de Motoristas");
                cotamotoristas = sc.nextDouble();

            System.out.println("Digite o Numero da Cota de Gigas");
                cotagigas = sc.nextDouble();
            
            System.out.println("Digite a cobrança Fixa");
                 cobrançafixa = sc.nextDouble();

        }  

    //Pergunta para calcular os adicionais 
      
            
        System.out.println("Você deseja o calculo dos Adicionais ? ");
            String pergunta = sc.nextLine();
        
    if (pergunta.equals("sim")) {       

    //Insersão de dados                    

        System.out.println("Digite O id do Contrato");
            idcontrato = sc.nextLine();

        System.out.println("Digite o Mês de Referência");
            mesdereferencia = sc.next();
            
        System.out.println("Digite o valor Fixo de Pagamento");
            Pagamentofixo = sc.nextDouble();

        System.out.println("Digite o Numero de comprovações efetuadas");
            numerocomprov = sc.nextDouble();

        System.out.println("Digite o Valor a ser pago por Exedente");
            exdentecomprov = sc.nextDouble();
    
        System.out.println("Digite a conta de Motorista utilizadas");
            numeromoto = sc.nextDouble();
            
        System.out.println("Digite o Valor a ser pago por Exedente");
            exdentemoto = sc.nextDouble();
        
        System.out.println("Digite o Numero de Gigas utlizados");
            numerogigas = sc.nextDouble();
            sc.nextLine();
            
        System.out.println("Digite o Valor a ser pago por Exedente");
            exdentegigas = sc.nextDouble();
        
        System.out.println("Digite a cota da empresa de Comprovação");
            comprovmesusuario = sc.nextDouble();

        System.out.println("Digite a Cota de Motoristas da empresa");
            Motoristas = sc.nextDouble();

        System.out.println("Digite a Cota de Gigas da empresa");
            gigas = sc.nextDouble();
        }
    
        double calculocomprov = 0, calculomoto = 0, calculogigas=0, calculofinal = 0;

        //calculo dos Adicionais 
    
        
    
        
    
    
    
        
        double calccomprov=0;
        double calcmoto=0;
        double calcgigas=0;
       
    
        // calculo comprovações
        if (numerocomprov > comprovmesusuario){
            calccomprov = numerocomprov - comprovmesusuario;
        }       
        if (numerocomprov > comprovmesusuario){
            calculocomprov = (numerocomprov - comprovmesusuario) * exdentecomprov;
        }
        //calculo motoristas
        if (numeromoto > Motoristas){
            calcmoto = (numeromoto - Motoristas);
        }
        
        if (numeromoto > Motoristas){
            calculomoto = (numeromoto - Motoristas) * exdentemoto; 
        }
        
        //calculo gigas
        if(numerogigas>gigas){
            calcgigas=numerogigas-gigas;
        }

        if (numerogigas>gigas){
            calculogigas = (numerogigas - gigas) * exdentegigas;
        }
        //calculo final
        calculofinal = Pagamentofixo + calculocomprov + calculogigas + calculomoto;
            
            
        // retorno do calculo final
        String resultado;      
        
        resultado = "ID do contato: " + idcontrato + "\n";
        
        resultado += "O valor Fixo de Pagamento: " + Pagamentofixo + " $" + "\n"; 
        
        resultado += "O valor liquido de Pagamento: " + calculofinal+" $" + "\n";
        
        if (calculocomprov>0){
            resultado += "Valor que Devera ser pago exedente das Comprovções: " + calculocomprov+" $" + "\n";
        }
        if (calculomoto>0){
            resultado += "Valor que Devera ser pago exedente dos Motoristas: " + calculomoto+" $" + "\n";
        }
        if (calculogigas>0){
            resultado += "Valor que Devera ser pago exedente dos Gigas Utilizados : " + calculogigas+" na$" + "\n";
        }
        if (calculocomprov!=0){
            resultado += "Valor exedente das comprovações: " + calccomprov + "\n";
        }
        if (calculomoto>0){
            resultado += "Valor exedente das cotas de Motorista: " + calcmoto + "\n";
        }
        if (calculogigas>0){
            resultado += "Valor exedente dos gigas: " + calcgigas + "\n";
        }
        if (calculocomprov==0){
            resultado += "Não existe Valor exedente para as comprovações: " + calculocomprov + "\n";
        }
        if (calculomoto==0){
            resultado += "Não existe valor exedente para a cota de Motoristas: " + calculomoto + "\n";
        }
        if (calculogigas==0){
            resultado += "Nao existe Valor exedente para a cota de gigas: " + calculogigas + "\n";
        }
        
         
            
        System.out.println(resultado);
    
        
    }
}
