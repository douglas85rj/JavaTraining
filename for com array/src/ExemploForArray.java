public class ExemploForArray {
    public static void main(String[] args) {
String alunos [] = {"João", "Maria", "José", "Pedro", "Ana"};

// for (int x = 0; x < alunos.length; x++) {
//     System.out.println("Aluno: " + alunos[x]);

for (String aluno : alunos) {
    System.out.println("Aluno: " + aluno);
}
    }
}

