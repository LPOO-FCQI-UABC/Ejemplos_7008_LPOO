import Ecosistema as Ecosistema
import Biosenosis as Biosenosis
import Biotopo as Biotopo
import SistemaBiologico as SistemaBiologico

def a_method(name):
    print(f'Hi, {name}')  # Press ⌘F8 to toggle the breakpoint.

if __name__ == '__main__':
    biosenosis = Biosenosis.Biosenosis("Biosenosis 1")
    biotopo = Biotopo.Biotopo("Biotopo 1")
    sistemaBiologico = SistemaBiologico.SistemaBiologico("Sistema Biologico 1")
    ecosistema = Ecosistema.Ecosistema("Ecosistema 1")
    print(biosenosis)
    print(biotopo)
    print(sistemaBiologico)
    print(ecosistema)