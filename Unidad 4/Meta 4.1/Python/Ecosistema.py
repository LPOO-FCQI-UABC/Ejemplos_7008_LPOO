#!/usr/bin/python
# -*- coding: UTF-8 -*-
import SistemaBiologico
from typing import List

class Ecosistema(SistemaBiologico):
	def __init__(self):
		self._biosenosis = []
		"""# @AssociationMultiplicity *"""
		self._biotopos = []
		"""# @AssociationMultiplicity *"""

