import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,String>pessoas = ReadInfos();
        List<String> pessoas_masculinas = new ArrayList<>();
        List<String> pessoas_femininas = new ArrayList<>();
        for (Map.Entry<String,String> pessoa : pessoas.entrySet()){
            if(pessoa.getValue().equals("M")){
                pessoas_masculinas.add(pessoa.getKey());
            }
            if(pessoa.getValue().equals("F")){
                pessoas_femininas.add(pessoa.getKey());
            }
        }
        System.out.println("Pessoas masculinas: "+pessoas_masculinas);
        System.out.println("Pessoas femininas: "+pessoas_femininas);

    }
    public static Map<String, String> ReadInfos(){
        System.out.println("Insira as informações das pessoas\n\n os generos devem ser M ou F\n\n");
        Scanner s = new Scanner(System.in);
        Map<String,String> infos = new HashMap<>();
        for(int i = 0; i < 2;i++){
            System.out.println("Insira seu nome ");
            String nome = s.nextLine();

            System.out.println("Insira seu genero");
            String genero = s.nextLine();
            infos.put(nome,genero);
        }
        return infos;
    }
}