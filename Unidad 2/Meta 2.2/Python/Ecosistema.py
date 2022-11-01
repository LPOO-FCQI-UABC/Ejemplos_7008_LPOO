#!/usr/bin/python
# -*- coding: UTF-8 -*-
import SistemaBiologico
from typing import List

class Ecosistema(object):
	def __init__(self):
		self._isA : SistemaBiologico = None
		self._biosenosis = []
		"""# @AssociationMultiplicity *"""
		self._biotopos = []
		"""# @AssociationMultiplicity *"""

