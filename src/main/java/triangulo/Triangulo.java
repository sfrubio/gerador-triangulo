package triangulo;

public class Triangulo {

    public String classificaTriangulo(int LA, int LB, int LC) throws Exception {
        String resposta = "";
        if (LA <= 0 || LB <= 0 || LC <= 0)
            throw new Exception("inválido");
        if ((LA >= LB + LC) || (LB >= LA + LC) || (LC >= LA + LB))
            resposta = "NAO FORMA TRIANGULO";
        else {
            if (LA == LB && LB == LC)
                resposta = "EQUILATERO";
            else {
                if (LA == LB || LB == LC || LA == LC)
                    resposta = "ISOSCELES";
                else
                    resposta = "ESCALENO";
            }
        }
        return resposta;
    }
}
