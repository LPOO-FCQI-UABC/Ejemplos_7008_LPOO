import Ecosistema as Ecosistema
import Biosenosis as Biosenosis
import Biotopo as Biotopo
import SistemaBiologico as SistemaBiologico

if __name__ == '__main__':
    biosenosis = Biosenosis.Biosenosis("Biosenosis 1")
    biotopo = Biotopo.Biotopo("Biotopo 1")
    sistemaBiologico = SistemaBiologico.SistemaBiologico("Sistema Biologico 1")
    ecosistema = Ecosistema.Ecosistema("Ecosistema 1")
    print(biosenosis)
    print(biotopo)
    print(sistemaBiologico)
    print(ecosistema)

    ecosistema.getBiosenosis().append(biosenosis)
    ecosistema.getBiotopos().append(biotopo)
    print(ecosistema)

    biosenosis2 = Biosenosis.Biosenosis("Biosenosis 2")
    biotopo2 = Biotopo.Biotopo("Biotopo 2")
    ecosistema.getBiosenosis().append(biosenosis2)
    ecosistema.getBiotopos().append(biotopo2)
    print(ecosistema)