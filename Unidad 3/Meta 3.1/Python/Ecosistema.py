#!/usr/bin/python
# -*- coding: UTF-8 -*-
import SistemaBiologico as SistemaBiologico
import Biosenosis as Biosenosis
import Biotopo as Biotopo

from typing import List


class Ecosistema(SistemaBiologico.SistemaBiologico):
	def __init__(self, nombre: str):
		super().__init__(nombre)
		self.biotopos = []
		self.biosenosis = []

	def getBiotopos(self) -> List[Biotopo.Biotopo]:
		return self.biotopos
	
	def setBiotopos(self, biotopos: List[Biotopo.Biotopo]):
		self.biotopos = biotopos

	def getBiosenosis(self) -> List[Biosenosis.Biosenosis]:
		return self.biosenosis

	def setBiosenosis(self, biosenosis: List[Biosenosis.Biosenosis]):
		self.biosenosis = biosenosis

	def __str__(self):
		return "Ecosistema{" + "nombre=" + self.getNombre() + ", biotopos=" + str(self.getBiotopos()) + ", biosenosis=" + str(self.getBiosenosis()) + "}"
