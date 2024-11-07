
package projetopessoas;

public class Aluno extends Pessoa {
    private int nummat;
    private String curso;
    private boolean mat;
    
    
    public void cancelarMatr(){
        setMat(false);
        System.out.println("Sua matricula foi cancelada");
    }

    public int getNummat() {
        return nummat;
    }

    public void setNummat(int nummat) {
        this.nummat = nummat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isMat() {
        return mat;
    }

    public void setMat(boolean mat) {
        this.mat = mat;
    }
    
}
