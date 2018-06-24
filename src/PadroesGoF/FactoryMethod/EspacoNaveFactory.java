package PadroesGoF.FactoryMethod;

import PadroesGoF.FactoryMethod.Naves.DiscoveryOne;
import PadroesGoF.FactoryMethod.Naves.Enterprise;
import PadroesGoF.FactoryMethod.Naves.MilleniumFalcon;

public class EspacoNaveFactory {

    public EspacoNave criarEspacoNave(TipoDeNaveEspacial tipo_de_espaco_nave) {

        EspacoNave espacoNave = null;

        switch (tipo_de_espaco_nave) {

            case MILLENIUM_FALCON:
                espacoNave = new MilleniumFalcon();
                break;

            case ENTERPRISE:
                espacoNave = new Enterprise();
                break;

            case DISCOVERY_ONE:
                espacoNave = new DiscoveryOne();
                break;

        }

        return espacoNave;

    }

}
