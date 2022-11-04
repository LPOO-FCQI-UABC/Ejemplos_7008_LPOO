#!/usr/bin/python
# -*- coding: UTF-8 -*-
from typing import List

class Ecosistema(object):
	def __init__(self, nombre: str):
		self.nombre = nombre
	
	def setNombre(self, nombre: str):
		self.nombre = nombre

	def getNombre(self) -> str:
		return self.nombre	

	def __str__(self):
		return "Ecosistema{" + "nombre=" + self.nombre + '}'
	
