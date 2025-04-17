import random

while True:
    print("Vamos jogar, Jokenpô!")
    print("Para vencer, segue-se as seguintes regras:")
    print("• Pedra ganha da Tesoura (quebrando-a);")
    print("• Tesoura ganha do Papel (cortando-o);")
    print("• Papel ganha da Pedra (embrulhando-a).")
    print()
    print("Opções: ")
    print("(1) Humano contra Humano")
    print("(2) Humano contra Computador")
    print("(3) Computador contra Computador")
    print("(4) Sair")
    print()

    escolha = input("Escolha sua opção (1/2/3/4): ")
    print()

    if escolha == "1":
        pontuacao_jogador_a = 0
        pontuacao_jogador_b = 0
        partidas_jogadas_hh = 0
        numero_empates_hh = 0
        percentual_a = 0.0
        percentual_b = 0.0

        while True:
            print("Jogadores, escolham suas opções")
            print("(1) Pedra")
            print("(2) Papel")
            print("(3) Tesoura")
            print("(4) Voltar")
            print()
            escolha_jogador_a = input("Jogador A escolha sua opção: ")

            if escolha_jogador_a == "4":
                print("Voltando...")
                print()
                break

            print("Certo, agora aguarde o próximo jogador...")
            print()
            escolha_jogador_b = input("Jogador B escolha sua opção: ")
            print()

            if escolha_jogador_b == "4":
                print("Muito bem, voltando...")
                print()
                break

            if escolha_jogador_a == escolha_jogador_b:
                numero_empates_hh = numero_empates_hh + 1
                partidas_jogadas_hh = partidas_jogadas_hh + 1

                print("E o resultado é...")
                print("Empate!")
                print()
                print("Pontuação do Jogador A:", pontuacao_jogador_a)
                print("Pontuação do Jogador B:", pontuacao_jogador_b)
                print()
                print("Percentual de Vitórias do Jogador A:", percentual_a)
                print("Percentual de Vitórias do Jogador B", percentual_b)
                print()
                print("Número de Partidas jogadas: ", partidas_jogadas_hh)
                print("Número de Empates: ", numero_empates_hh)
                print()

                while True:
                    print("Desejam continuar jogando?")
                    print("(1) Continuar jogando")
                    print("(2) Sair do jogo")
                    print()

                    continuar = input("Escolha sua opção: ")

                    if continuar == "1":
                        print("Continuando...")
                        print()
                        break
                    elif continuar == "2":
                        print("Obrigado por jogar!")
                        print()
                        exit()
                    else:
                        print("Opção inválida! Tente novamente.")
                        print()
                        continue

            else:
                partidas_jogadas_hh = partidas_jogadas_hh + 1
                print("E o resultado é...")
                
                if escolha_jogador_a == "1" and escolha_jogador_b == "2":
                    print("Jogador B venceu! Pedra ganha de Papel.")
                    pontuacao_jogador_b = pontuacao_jogador_b + 1
                
                elif escolha_jogador_a == "1" and escolha_jogador_b == "3":
                    print("Jogador A venceu! Pedra ganha de Tesoura.")
                    pontuacao_jogador_a = pontuacao_jogador_a + 1

                elif escolha_jogador_a == "2" and escolha_jogador_b == "1":
                    print("Jogador A venceu! Papel ganha de Pedra.")
                    pontuacao_jogador_a = pontuacao_jogador_a + 1

                elif escolha_jogador_a == "2" and escolha_jogador_b == "3":
                    print("Jogador B venceu! Tesoura ganha de Papel.")
                    pontuacao_jogador_b = pontuacao_jogador_b + 1

                elif escolha_jogador_a == "3" and escolha_jogador_b == "1":
                    print("Jogador B venceu! Pedra ganha de Tesoura.")
                    pontuacao_jogador_b = pontuacao_jogador_b + 1

                elif escolha_jogador_a == "3" and escolha_jogador_b == "2":
                    print("Jogador A venceu! Tesoura ganha de Papel.")
                    pontuacao_jogador_a = pontuacao_jogador_a + 1

                percentual_a = (pontuacao_jogador_a / partidas_jogadas_hh) * 100 if partidas_jogadas_hh > 0 else 0.0
                percentual_b = (pontuacao_jogador_b / partidas_jogadas_hh) * 100 if partidas_jogadas_hh > 0 else 0.0

                print()
                print("Pontuação do Jogador A:", pontuacao_jogador_a)
                print("Pontuação do Jogador B:", pontuacao_jogador_b)
                print()
                print("Percentual de Vitórias do Jogador A:", percentual_a)
                print("Percentual de Vitórias do Jogador B", percentual_b)
                print()
                print("Número de Partidas jogadas: ", partidas_jogadas_hh)
                print("Número de Empates: ", numero_empates_hh)
                print()

                while True:
                    print("Desejam continuar jogando?")
                    print("(1) Continuar jogando")
                    print("(2) Sair do jogo")
                    print()

                    continuar = input("Escolha sua opção: ")

                    if continuar == "1":
                        print("Continuando...")
                        print()
                        break
                    elif continuar == "2":
                        print("Obrigado por jogar!")
                        print()
                        exit()
                    else:
                        print("Opção inválida! Tente novamente.")
                        print()
                        continue

    elif escolha == "2":
        pontuacao_jogador = 0
        pontuacao_computador = 0
        partidas_jogadas_hc = 0
        numero_empates_hc = 0
        percentual_jogador = 0.0
        percentual_computador = 0.0

        while True:
            print("Jogador, escolha sua opção:")
            print("(1) Pedra")
            print("(2) Papel")
            print("(3) Tesoura")
            print("(4) Voltar")
            print()

            escolha_jogador = input("Sua escolha: ")

            if escolha_jogador == "4":
                print("Voltando...")
                print()
                break

            print("Certo, agora aguarde o computador...")
            print()
            
            escolha_computador = random.choice(["1", "2", "3"])

            print("Computador escolheu:", escolha_computador)
            print()

            if escolha_jogador == escolha_computador:
                numero_empates_hc = numero_empates_hc + 1
                partidas_jogadas_hc = partidas_jogadas_hc + 1
            
                print("E o resultado é...")
                print("Empate!")
                print()
                print("Sua pontuação:", pontuacao_jogador)
                print("Pontuação do Computador:", pontuacao_computador)
                print()
                print("Percentual de Vitórias do Jogador:", percentual_jogador)
                print("Percentual de Vitórias do Computador", percentual_computador)
                print()
                print("Número de Partidas jogadas: ", partidas_jogadas_hc)
                print("Número de Empates: ", numero_empates_hc)
                print()

                while True:
                    print("Deseja continuar jogando?")
                    print("(1) Continuar jogando")
                    print("(2) Sair do jogo")
                    print()

                    continuar = input("Escolha sua opção: ")

                    if continuar == "1":
                        print("Continuando...")
                        print()
                        break

                    elif continuar == "2":
                        print("Obrigado por jogar!")
                        print()
                        exit()

                    else:
                        print("Opção inválida! Tente novamente.")
                        print()
                        continue

            else:
                partidas_jogadas_hc = partidas_jogadas_hc + 1
                print("E o resultado é...")
                
                if escolha_jogador == "1" and escolha_computador == "2":
                    print("Computador venceu! Papel ganha de Pedra.")
                    pontuacao_computador = pontuacao_computador + 1
                elif escolha_jogador == "1" and escolha_computador == "3":
                    print("Você venceu! Pedra ganha de Tesoura.")
                    pontuacao_jogador = pontuacao_jogador + 1
                elif escolha_jogador == "2" and escolha_computador == "1":
                    print("Você venceu! Papel ganha de Pedra.")
                    pontuacao_jogador = pontuacao_jogador + 1
                elif escolha_jogador == "2" and escolha_computador == "3":
                    print("Computador venceu! Tesoura ganha de Papel.")
                    pontuacao_computador = pontuacao_computador + 1
                elif escolha_jogador == "3" and escolha_computador == "1":
                    print("Computador venceu! Pedra ganha de Tesoura.")
                    pontuacao_computador = pontuacao_computador + 1
                elif escolha_jogador == "3" and escolha_computador == "2":
                    print("Você venceu! Tesoura ganha de Papel.")
                    pontuacao_jogador = pontuacao_jogador + 1

                percentual_jogador = (pontuacao_jogador / partidas_jogadas_hc) * 100 if partidas_jogadas_hc > 0 else 0.0
                percentual_computador = (pontuacao_computador / partidas_jogadas_hc) * 100 if partidas_jogadas_hc > 0 else 0.0

                print()
                print("Sua pontuação:", pontuacao_jogador)
                print("Pontuação do Computador:", pontuacao_computador)
                print()
                print("Percentual de Vitórias do Jogador:", percentual_jogador)
                print("Percentual de Vitórias do Computador", percentual_computador)
                print()
                print("Número de Partidas jogadas: ", partidas_jogadas_hc)
                print("Número de Empates: ", numero_empates_hc)
                print()


                while True:
                    print("Deseja continuar jogando?")
                    print("(1) Continuar jogando")
                    print("(2) Sair do jogo")
                    print()

                    continuar = input("Escolha sua opção: ")

                    if continuar == "1":
                        print("Continuando...")
                        print()
                        break
                    elif continuar == "2":
                        print("Obrigado por jogar!")
                        print()
                        exit()
                    else:
                        print("Opção inválida! Tente novamente.")
                        print()
                        continue

    elif escolha == "3":
        pontuacao_computador_a = 0
        pontuacao_computador_b = 0
        partidas_jogadas_cc = 0
        numero_empates_cc = 0
        percentual_computador_a = 0.0
        percentual_computador_b = 0.0
        
        print("Apenas computadores jogam, deseja continuar?")
        print("(1) Sim, iniciar")
        print("(2) Não, voltar")
        print()

        escolha_espectador = input("Escolha sua opção: ")

        if escolha_espectador != "1":
            print("Voltando...")
            print()
            continue

        while True:
            print()
            print("Os computadores A e B escolhem entre:")
            print("(1) Pedra")
            print("(2) Papel")
            print("(3) Tesoura")
            print()

            escolha_computador_a = random.choice(["1", "2", "3"])
            escolha_computador_b = random.choice(["1", "2", "3"])

            print("Computador A escolheu:", escolha_computador_a)
            print("Computador B escolheu:", escolha_computador_b)
            print()
            print("E o resultado é...")

            if escolha_computador_a == escolha_computador_b:
                print("Empate!")
                numero_empates_cc = numero_empates_cc + 1
                partidas_jogadas_cc = partidas_jogadas_cc + 1

            elif ((escolha_computador_a == "1" and escolha_computador_b == "3") or
                  (escolha_computador_a == "2" and escolha_computador_b == "1") or
                  (escolha_computador_a == "3" and escolha_computador_b == "2")):
                print("Computador A venceu!")
                pontuacao_computador_a = pontuacao_computador_a + 1
                partidas_jogadas_cc = partidas_jogadas_cc + 1
                
            else:
                print("Computador B venceu!")
                pontuacao_computador_b = pontuacao_computador_b + 1
                partidas_jogadas_cc = partidas_jogadas_cc + 1
                
            percentual_computador_a = (pontuacao_computador_a / partidas_jogadas_cc) * 100 if partidas_jogadas_cc > 0 else 0.0
            percentual_computador_b = (pontuacao_computador_b / partidas_jogadas_cc) * 100 if partidas_jogadas_cc > 0 else 0.0

            print()
            print("Pontuação do Computador A:", pontuacao_computador_a)
            print("Pontuação do Computador B:", pontuacao_computador_b)
            print()
            print("Percentual de Vitórias do Jogador:", percentual_computador_a)
            print("Percentual de Vitórias do Computador", percentual_computador_b)
            print()
            print("Número de Partidas jogadas: ", partidas_jogadas_cc)
            print("Número de Empates: ", numero_empates_cc)
            print()

            while True:
                print("Deseja que continuem jogando?")
                print("(1) Continuar jogando")
                print("(2) Sair do jogo")
                print()

                continuar = input("Escolha sua opção: ")

                if continuar == "1":
                    print("Continuando...")
                    print()
                    break
                elif continuar == "2":
                    print("Obrigado por jogar!")
                    print()
                    exit()
                else:
                    print("Opção inválida! Tente novamente.")
                    print()
                    continue

    elif escolha == "4":
        print("Obrigado por jogar!")
        print()
        exit()

    else:
        print("Opção inválida! Tente novamente.")
        print()
