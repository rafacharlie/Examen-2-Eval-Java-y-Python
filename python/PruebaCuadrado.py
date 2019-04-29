'''
Prueba cuadrado

@author: Rafael Infante
'''
from examen2Eval.Cuadrado import Cuadrado

'''
instancia1
'''
try:
    cuadrado1 = Cuadrado(6)
    print(cuadrado1)
except ArithmeticError:
    print("Error, el lado del cuadrado debe estar comprendido entre 1 y 10")
except TypeError:
    print("Error. Comprueba que el lado sea un valor entero.")
except:
    print("Error. Solo puedes comparar objetos de tipo Cuadrado entre si")

'''
instancia2
'''

try:
    cuadrado2 = Cuadrado(7)
    print(cuadrado2)

except ArithmeticError:
    print("Error, el lado del cuadrado debe estar comprendido entre 1 y 10")
except TypeError:
    print("Error. Comprueba que el lado sea un valor entero.")
except:
    print("Error. Solo puedes comparar objetos de tipo Cuadrado entre si")

'''comparacion de objetos'''    
print(cuadrado1==cuadrado2)
print(cuadrado1>cuadrado2)
print(cuadrado1<cuadrado2)