package Aplicações;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.net.ssl.SSLEngineResult.Status;

import Entidades.Eventos;

public class InterEventos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Eventos> evento = new ArrayList<>();

		int opc;

		do {
			System.out.println("\n========MENU========");
			System.out.println("Escolha uma opção:");
			System.out.println("1. Cadastrar um Evento.");
			System.out.println("2. Remover um Evento.");
			System.out.println("3. Consultar os dados de um determinado evento.");
			System.out.println("4. Iniciar a venda de ingressos para um determinado evento");
			System.out.println("5. Encerrar a venda de ingressos para um determinado evento. ");
			System.out.println("6. Cancelar um determinado evento.");
			System.out.println("7. Marcar um determinado evento como já ocorrido.");
			System.out.println("8. Consultar a quantidade de lugares livres para um determinado evento.");
			System.out.println("9. Vender ingresso de um determinado evento.");
			System.out.println("10. Vender ingresso de um evento com quantidade de ingressos default.");
			System.out.println("11. Listar todos os dados dos eventos.");
			System.out.println("12. Sair" + "\n");

			opc = in.nextInt();

			switch (opc) {
			case 1:
				System.out.println("========Cadastro de Evento:========");
				System.out.println("Digite o código do evento: ");
				int codigo = in.nextInt();
				System.out.println("Digite o título do evento: ");
				String titulo = in.next();
				System.out.println("Digite o local do evento: ");
				String local = in.next();
				System.out.println("Digite a data do evento: ");
				String data = in.next();
				System.out.println("Digite a hora do evento: ");
				String hora = in.next();
				evento.add(new Eventos(codigo, titulo, local, data, hora));
				System.out.println("Evento cadastrado.");

				continue;

			case 2:
				System.out.println("Digite o código do evento que gostaria de remover: ");
				codigo = in.nextInt();
				for (int i = 0; i < evento.size(); i++) {
					if (evento.get(i).getCodigo() == codigo) {
						System.out.println("Evento removido.");
						evento.remove(i);
					} else {
						System.out.println("Evento não encontrado.");
					}

				}
				continue;

			case 3:
				System.out.println("Digite o código do evento que gostaria de consultar: ");
				codigo = in.nextInt();
				for (int i = 0; i < evento.size(); i++) {
					if (evento.get(i).getCodigo() == codigo) {
						System.out.println("O código é: " + evento.get(i).getCodigo() + "\no título é: "
								+ evento.get(i).getTitulo() + "\no local é: " + evento.get(i).getLocal()
								+ "\na data é: " + evento.get(i).getData() + "\na hora é: " + evento.get(i).getHora());

					} else {
						System.out.println("Evento não encontrado.");
					}

				}

				continue;

			case 4:
				System.out.println("Digite o código do evento para iniciar a venda de ingressos: ");
				codigo = in.nextInt();
				for (int i = 0; i < evento.size(); i++) {
					if (evento.get(i).getCodigo() == codigo) {
						evento.get(i).iniciarvenda();
					} else {
						System.out.println("Evento não encontrado.");
					}

				}
				continue;

			case 5:
				System.out.print("Digite o código do evento para finalizar a venda de ingressos: ");
				codigo = in.nextInt();
				for (int i = 0; i < evento.size(); i++) {
					if (evento.get(i).getCodigo() == codigo) {
						evento.get(i).finalizarvenda();
					} else {
						System.out.println("Evento não encontrado.");
					}

				}
				continue;

			case 6:
				System.out.println("Digite o código do evento que gostaria de cancelar: ");
				codigo = in.nextInt();
				for (int i = 0; i < evento.size(); i++) {
					if (evento.get(i).getCodigo() == codigo) {
						evento.get(i).cancelarevento();

					} else {
						System.out.println("Evento não encontrado.");
					}
				}
				continue;

			case 7:
				System.out.println("Digite o código do evento que gostaria de marcar como expirado: ");
				codigo = in.nextInt();
				for (int i = 0; i < evento.size(); i++) {
					if (evento.get(i).getCodigo() == codigo) {
						evento.get(i).eventoocorrido();
					} else {
						System.out.println("Evento não encontrado.");
					}
				}
				continue;

			case 8:
				System.out.println(
						"Digite o código do evento que gostaria de consultar a quantidade de lugares livres: ");
				codigo = in.nextInt();
				for (int i = 0; i < evento.size(); i++) {
					if (evento.get(i).getCodigo() == codigo) {
						evento.get(i).Qtdlugareslivres(i);
					} else {
						System.out.println("Evento não encontrado.");
					}
				}
				continue;

			case 9:
				System.out.println("Digite o código do evento para venda dos ingressos: ");
				codigo = in.nextInt();
				for (int i = 0; i < evento.size(); i++) {
					if (evento.get(i).getStatus() == "Vendas iniciadas") {
						if (evento.get(i).getCodigo() == codigo) {
							System.out.println("Quantos ingressos serão comprados?");
							evento.get(i).setQtdlugaresvendidos(in.nextInt());
							System.out.println(
									"Foram vendidos: " + evento.get(i).getQtdlugaresvendidos() + " ingressos.");

						} else {
							System.out.println("Evento não encontrado.");
						}
					} else {
						System.out.println("As vendas não foram iniciadas, ocorreram ou foram canceladas.");
					}

				}
				continue;
			case 10:
				System.out.println("Digite o código do evento para venda dos ingressos default: ");
				codigo = in.nextInt();
				for (int i = 0; i < evento.size(); i++) {
					if (evento.get(i).getStatus() == "Vendas iniciadas") {
						if (evento.get(i).getCodigo() == codigo) {
							evento.get(i).setQtdlugaresvendidos(2);

							System.out.println(
									"Foram vendidos: " + evento.get(i).getQtdlugaresvendidos() + " ingressos.");
						} else {
							System.out.println("Evento não encontrado.");
						}
					}else {
						System.out.println("As vendas não foram iniciadas, ocorreram ou foram canceladas.");
					}
				}

				continue;

			case 11:

				System.out.println("========Informações dos Eventos:========");
				System.out.println("\n" + evento.toString());

				continue;

			case 12:
				System.out.println("Programa finalizado.");

				continue;
			default:
				System.out.println("Opção inválida.");

			}

		} while (opc != 12);

		in.close();
	}

}
