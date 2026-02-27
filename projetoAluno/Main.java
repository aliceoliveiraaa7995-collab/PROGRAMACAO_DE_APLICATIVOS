public class main {
        public static void main(String[] args){
            Aluno[] alunos = new Aluno[5];
            alunos[0] = new Aluno ("Alice", 16, "232005139");
            alunos[1] = new Aluno ("Gabriel", 16, "025025686");
            alunos[2] = new Aluno ("Bruno", 18, "23091374" );
            alunos[3] = new Aluno ("Phillipe", 22, "2845392" );
            alunos[4] = new Aluno ("Enzo", 19, "84357254");
     
            for (int i = 0; i < alunos.leingh; i++){
            System.out.println("Aluno: " + (i + 1));
            System.out.println("Nome: " + aluno[i].getNome());
            System.out.println("Idade: " + aluno[i].getIdade());
            System.out.println("Matricula: " + aluno[i].getMatricula());
            System.out.println("-----------------");
        }
    }
}
