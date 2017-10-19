public class Teclado {

    public String verificaAlfabeto(String[] s){
        String resultado = "";
        for(int i = 0; i<s.length; i++){
            switch (s[i]) {
                case "1":
                    resultado =  resultado + "a";
                    break;
                case "11":
                    resultado =  resultado + "b";
                    break;
                case "111":
                    resultado =  resultado + "c";
                    break;
                case "2":
                    resultado =  resultado + "d";
                    break;
                case "22":
                    resultado =  resultado + "e";
                    break;
                case "222":
                    resultado =  resultado + "f";
                    break;
                case "3":
                    resultado =  resultado + "g";
                    break;
                case "33":
                    resultado = resultado + "h";
                    break;
                case "333":
                    resultado = resultado + "i";
                    break;
                case "4":
                    resultado = resultado + "j";
                    break;
                case "44":
                    resultado = resultado +"k";
                    break;
                case "444":
                    resultado = resultado +"l";
                    break;
                case "5":
                    resultado = resultado +"m";
                    break;
                case "55":
                    resultado = resultado + "n";
                    break;
                case "555":
                    resultado = resultado + "o";
                    break;
                case "6":
                    resultado = resultado + "p";
                    break;
                case "66":
                    resultado = resultado + "q";
                    break;
                case "666":
                    resultado = resultado + "r";
                    break;
                case "6666":
                    resultado = resultado + "s";
                    break;
                case "7":
                    resultado = resultado + "t";
                    break;
                case "77":
                    resultado = resultado + "u";
                    break;
                case "777":
                    resultado = resultado + "v";
                    break;
                case "8":
                    resultado = resultado + "w";
                    break;
                case "88":
                    resultado = resultado + "x";
                    break;
                case "888":
                    resultado = resultado + "y";
                    break;
                case "8888":
                    resultado = resultado + "z";
                    break;
            }
        }
        return resultado;
    }

    public String decodifica(String s) {

        String digitos[] = s.split("#");
        String result = null;

        result = verificaAlfabeto(digitos);
        return result;
    }
}
