public class TipoLogico {
    public static void main(String[] args) {
        Boolean trueVariable = true;
        System.out.println("Variável verdadeira: " + trueVariable);
        
        Boolean falseVariable = false;
        System.out.println("Variável falsa: " + falseVariable);

        System.out.println("----------------------------------------------------------------------------------");

        Integer age = 20;

        Boolean canBuyBeer = age >= 18;
        //System.out.println("Pode comprar cerveja? " + canBuyBeer);

        if (canBuyBeer) {
            System.out.println("Sim! Ele(a) pode comprar cerveja.");
        }
        else{
            System.out.println("Não! Ele(a) não pode comprar cerveja.");
        }


    }
}
