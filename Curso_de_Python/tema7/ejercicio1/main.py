#!/usr/bin/env python3
# -*- coding: utf-8 -*-


import operaciones as op
import operaciones2 as op2


A = 5
B = 3
C = 2

def calcular():
    print('%.2f + %.2f = %.2f' % (A, B, op.suma(A, B)))
    print('%.2f - %.2f = %.2f' % (A, B, op.resta(A, B)))
    print('%.2f * %.2f = %.2f' % (A, B, op.multiplica(A, B)))
    print('%.2f / %.2f = %.2f' % (A, B, op.divide(A, B)))
    
    print('%.2f + %.2f + %.2f = %.2f' % (A, B, C, op2.suma(A, B, C)))
    print('%.2f * %.2f * %.2f = %.2f' % (A, B, C, op2.multiplica(A, B, C)))


if __name__ == '__main__':
    calcular()
