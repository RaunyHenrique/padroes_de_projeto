package PadroesGoF.Visitor.Exemplo1;

import PadroesGoF.Visitor.Exemplo1.Cachorro;
import PadroesGoF.Visitor.Exemplo1.Gato;

public interface Visitor {

    void visita(Cachorro cachorro);
    void visita(Gato gato);

}
