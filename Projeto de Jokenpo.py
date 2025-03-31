print("Bem-vindo ao jogo de Pedra, Papel e Tesoura contra a máquina v0.!")
print("Escolha a dificuldade: Normal, Hardcore (Aviso: ela é muito difícil)")
dificuldade = str(input())
if dificuldade == "Hardcore" or "hardcore":
    player = str(input("Pedra, Papel, Tesoura. Escolha: "))
    if player == "Pedra" or "papel":
        print("A máquina jogou: Papel")
        print("Você perdeu!")
    if player == "Papel" or "papel":
        print("A máquina jogou: Tesoura")
        print("Você perdeu!")
    if player == "Tesoura" or "tesoura":
        print("A máquina jogou: Pedra")
        print("Você perdeu!")

if dificuldade == "Normal" or "normal":
    player = str(input("Pedra, Papel, Tesoura. Escolha: "))
    import random
    lista = ['Pedra', 'Papel', 'Tesoura']
    maquina = random.choice(lista)
    print("A máquina jogou:", maquina)
    if player == "Pedra" or "pedra":
        if maquina == "Pedra":
            print("Empatou!")
        if maquina == "Papel":
            print("Você perdeu!")
        if maquina == "Tesoura":
            print("Você ganhou!")
    if player == "Papel" or "papel":
        if maquina == "Pedra":
            print("Você ganhou!")
        if maquina == "Papel":
            print("Empatou!")
        if maquina == "Tesoura":
            print("Você perdeu!")
    if player == "Tesoura" or "tesoura":
        if maquina == "Pedra":
            print("Você perdeu!")
        if maquina == "Papel":
            print("Você ganhou!")
        if maquina == "Tesoura":
            print("Empatou!")
        