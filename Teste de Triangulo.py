print("Verificador de tipos de triângulo")
lado_a = float(input("Digite o tamanho (cm) do lado A: "))
lado_b = float(input("Digite o tamanho (cm) do lado B: "))
lado_c = float(input("Digite o tamanho (cm) do lado C: "))
if lado_a > lado_b + lado_c:
    print("Você não tem um triângulo.")
elif lado_b > lado_a + lado_c:
    print("Você não tem um triângulo.")
elif lado_c > lado_a + lado_b:
    print("Você não tem um triângulo.")
else:
    if lado_a == lado_b == lado_c:
        print("Você tem um triangulo equilatero")