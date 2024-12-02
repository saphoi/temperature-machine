# Máquina de registros de picos de temperatura

Este código acompanha um modelo de máquina de turing.

O intuito deste código em conjunto com o modelo é representar uma máquina que lê as temperaturas de um lugar qualquer por um determinado período de tempo (dia, mês, ano) e devolve alertas quando a temperatura estiver acima de uma temperatura máxima predeterminada ou abaixo de uma temperatura mínima predeterminada.

Esta máquina foi desenvolvida para a disciplina Teoria da Computação do curso Engenharia de Software da UPE Garanhuns.

**Modelo de máquina de turing**

![alt text](modelo.jpg)

q0: Início  
q1: Temperatura normal  
q2: Temperatura acima da média  
q3: Temperatura abaixo da média  
q4: Final

x: min < temp < max  
y: temp > max  
z: temp < min  
e: Sem mais temperaturas registradas (ao final da palavra é necessário colocar um "e", end, pra sinalizar que aquela foi a última temperatura)  
N: Sem alerta, temperatura normal  
A: Alerta de temperatura muito alta  
B: Alerta de temperatura muito baixa  
