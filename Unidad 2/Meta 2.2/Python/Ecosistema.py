#!/usr/bin/python
# -*- coding: UTF-8 -*-
import SistemaBiologico as SistemaBiologico
import Biosenosis as Biosenosis
import Biotopo as Biotopo

from typing import List



class Ecosistema(object):
	def __init__(self, nombre: str):
		self.nombre = nombre
		self.biotopos = []
		self.biosenosis = []

	def setNombre(self, nombre: str):
		self.nombre = nombre

	def getNombre(self) -> str:
		return self.nombre

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

		


