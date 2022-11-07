#!/usr/bin/python
# -*- coding: UTF-8 -*-
from typing import List

class SistemaBiologico(object):
	def __init__(self, nombre: str):
		self._nombre = nombre

	def getNombre(self) -> str:
		return self._nombre

	def setNombre(self, nombre: str):
		self._nombre = nombre

	def __str__(self) -> str:
		return "SistemaBiologico{" + "nombre=" + self._nombre + '}'