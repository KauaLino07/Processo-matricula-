
package principal;

public class CalculaFuncionario {
    private double salarioBruto, inss, Ir, salarioLiquido, fgts;
    
    public CalculaFuncionario(Double salarioBruto){
    this.setSalarioBruto(salarioBruto);
    }


    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getIr() {
        return Ir;
    }

    public void setIr(double Ir) {
        this.Ir = Ir;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getFgts() {
        return fgts;
    }

    public void setFgts(double fgts) {
        this.fgts = fgts;
    }
    
    public void calculoFgts(Double fgts){
        this.setFgts((0.08)*salarioBruto);
    }
    
    public void calculaInss(Double inss){
        if(this.getSalarioBruto()<= 1045){
            inss = (7.5/100) * salarioBruto;
        }else if(this.getSalarioBruto()<= 2.089){
            inss = (9/100)*salarioBruto;
        }else if (this.getSalarioBruto()<= 3.134){
            inss = (12/100) * salarioBruto;
        }else {
            inss = (14/100) * salarioBruto;
        } 
    }
    public void calculaIr(Double Ir){
        if(this.getSalarioBruto()<= 1903){
            Ir = salarioBruto * (7.5/100); 
        }else if (this.getSalarioBruto()<= 2826){
            Ir = salarioBruto * (15/100);
        }else if (this.getSalarioBruto()<=3751){
            Ir = salarioBruto * (22.5/100);
        }else if (this.getSalarioBruto()<=4664){
            Ir = salarioBruto * (22.5/100);
        }if (this.getSalarioLiquido() > 4664){
            Ir = salarioBruto * (27.5/100);
        }
    }
    
    public void calculaSalarioLiquido(Double SalarioLiquido){
        this.salarioLiquido = (salarioBruto - (inss + Ir));
    }
    
}