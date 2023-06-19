package Aplicações;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Eventos;

public class InterEventos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Eventos> evento = new ArrayList<>();

		int qtdEventos = 0;

		int opc;

		do {
			System.out.println("========MENU========");
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
			System.out.println("10. Listar todos os dados dos eventos.");
			System.out.println("11. Sair");

			opc = in.nextInt();

			switch (opc) {
			case 1:
				System.out.println("\nCadastro de Evento:");
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
					}

				}
				continue;

			case 5:
				System.out.print("Digite o código do evento para finalizar a venda de ingressos: ");
				codigo = in.nextInt();
				for (int i = 0; i < evento.size(); i++) {
					if (evento.get(i).getCodigo() == codigo) {
						evento.get(i).finalizarvenda();
					}

				}
				continue;

			case 6:
				System.out.println("Digite o código do evento que gostaria de cancelar: ");
				codigo = in.nextInt();
				for (int i = 0; i < evento.size(); i++) {
					if (evento.get(i).getCodigo() == codigo) {
						evento.get(i).cancelarevento();

					}
				}
				continue;

			case 7:
				System.out.println("Digite o código do evento que gostaria de marcar como expirado: ");
				codigo = in.nextInt();
				for (int i = 0; i < evento.size(); i++) {
					if (evento.get(i).getCodigo() == codigo) {
						evento.get(i).eventoocorrido();
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
					}
				}
				continue;

			case 9:
				System.out.println("Digite o código do evento para venda dos ingressos: ");
				codigo = in.nextInt();
				for (int i = 0; i < evento.size(); i++) {
					if (evento.get(i).getCodigo() == codigo) {
						System.out.println("Quantos ingressos serão comprados?");
						int qtd = in.nextInt();				
						System.out.println("Foram vendidos: " + qtd + " ingressos.");
						evento.get(i).Qtdlugareslivres(qtd);
						
						
					} else {
						System.out.println("Evento não encontrado.");
					}

				}
				continue;

			case 10:
				System.out.println("\n" + evento.toString());

				continue;

			default:
				System.out.println("Opção inválida.");

			}

		} while (opc != 11);

		in.close();
	}

}
