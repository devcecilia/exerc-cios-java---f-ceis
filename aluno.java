;

public class aluno {
    String aluno = "";
    int idade = 0;
    String curso = "";
    String comprimento = "";

    public aluno(String nomealuno, int alunoIdade, String cursoaluno){
        aluno = nomealuno;
        idade = alunoIdade;
        curso = cursoaluno;

    }
        public void DefinirComprimento (String Saudacaoaluno){
            comprimento = Saudacaoaluno;
        }
        public void Exibirstatus(){
        
            System.out.println("nome" + aluno);
            System.out.println("idade" + idade);
            System.out.println("curso" + curso);
            System.out.println("comprimento" + comprimento);
        }


        public static void main(String[] args) {{
            System.out.println("nome");
            System.out.println("idade" );
            System.out.println("curso");
            System.out.println("comprimento");
             
    }
        }
    }