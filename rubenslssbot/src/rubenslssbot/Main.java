package rubenslssbot;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.TelegramBotAdapter;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ChatAction;
import com.pengrad.telegrambot.request.GetUpdates;
import com.pengrad.telegrambot.request.SendChatAction;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.GetUpdatesResponse;
import com.pengrad.telegrambot.response.SendResponse;

public class Main {

	public static void main(String[] args) {
		// Cria��o do objeto bot com as informa��es de acesso
		TelegramBot bot = TelegramBotAdapter.build("634932318:AAF5-1Lu0QbX4NoOHwSsPoJtT5PS7mLuQYY");
		// objeto respons�vel por receber as mensagens
		GetUpdatesResponse updatesResponse;
		// objeto respons�vel por gerenciar o envio de respostas
		SendResponse sendResponse;
		// objeto respons�vel por gerenciar o envio de a��es do chat
		BaseResponse baseResponse;
		// controle de off-set, isto �, a partir deste ID ser� lido as mensagens
		// pendentes na fila
		int m = 0;
		// loop infinito pode ser alterado por algum timer de intervalo curto
		while (true) {
			// executa comando no Telegram para obter as mensagens pendentes a partir de um
			// off-set ( limite inicial )
			updatesResponse = bot.execute(new GetUpdates().limit(100).offset(m));
			// lista de mensagens
			List<Update> updates = updatesResponse.updates();
			// an�lise de cada a��o da mensagem
			for (Update update : updates) {
				// atualiza��o do off-set
				m = update.updateId() + 1;
				System.out.println("Recebendo mensagem:" + update.message().text());
				// envio de " Escrevendo " antes de enviar a resposta
				baseResponse = bot.execute(new SendChatAction(update.message().chat().id(), ChatAction.typing.name()));
				// verifica��o de a��o de chat foi enviada com sucesso
				System.out.println("Resposta de Chat Action Enviada?" + baseResponse.isOk());
				// envio da mensagem de resposta

				String mensagem = "N�o entendi...";
				
				String resposta = update.message().text();
				
				resposta = Uteis.tratarResposta(resposta);

				List< String > saudacao = new ArrayList<>();
				saudacao.add("ola");
				saudacao.add("oi");
				saudacao.add("bem");
				saudacao.add("tarde");
				saudacao.add("noite");
				saudacao.add("dia");
				
				List< String > despedida = new ArrayList<>();
				despedida.add("tchau");
				despedida.add("adeus");
				despedida.add("fui");
				despedida.add("obrigado");
				despedida.add("logo");		
				
				List< String > ofensas = new ArrayList<>();
				ofensas.add("burro");
				ofensas.add("otario");
				ofensas.add("babaca");
				ofensas.add("idiota");
				ofensas.add("viado");
				ofensas.add("merda");
				ofensas.add("animal");
				ofensas.add("retardado");
				ofensas.add("demente");
				ofensas.add("jumento");
				ofensas.add("bosta");
				ofensas.add("merda");
				ofensas.add("nada");
				
				Collections.sort(ofensas);
				Collections.sort(saudacao);
				Collections.sort(despedida);
				
				
				
				Pizza atum = new Pizza();	
				atum.setCodigo(1);
				atum.setNome("atum");
				atum.setPreco(40.0);
				

				Pizza bauru = new Pizza();
				bauru.setCodigo(2);
				bauru.setNome("bauru");
				bauru.setPreco(34.0);		
				
				Pizza calabresa = new Pizza();
				calabresa.setCodigo(3);
				calabresa.setNome("calabresa");
				calabresa.setPreco(36.0);
				
				
				Pizza baiana = new Pizza();
				baiana.setCodigo(4);
				baiana.setNome("baiana");
				baiana.setPreco(38.0);
				
				Pizza frango = new Pizza();
				frango.setCodigo(5);
				frango.setNome("frango");
				frango.setPreco(42.0);
				
				Pizza napolitana = new Pizza();
				napolitana.setCodigo(5);
				napolitana.setNome("napolitana");
				napolitana.setPreco(42.0);
				
				Pizza palmito = new Pizza();
				palmito.setCodigo(7);
				palmito.setNome("palmito");
				palmito.setPreco(44.0);
				
				List< Pizza > pizzas = new ArrayList<>();
				pizzas.add(atum);
				pizzas.add(bauru);
				pizzas.add(baiana);
				pizzas.add(calabresa);
				pizzas.add(frango);
				pizzas.add(napolitana);
				pizzas.add(palmito);				
				//Collections.sort(pizzas);


				Map<Integer,String> ingrediente = new HashMap<Integer,String>();				
				ingrediente.put(1,"Molho de tomate fresco");
				ingrediente.put(1,"atum especial s�lido");
				ingrediente.put(1,"cebola fatiada");
				ingrediente.put(1,"or�gano");
				ingrediente.put(1,"azeitonas pretas");	
				ingrediente.put(2,"Molho de tomate fresco");
				ingrediente.put(2,"presunto cozido picado");
				ingrediente.put(2,"mussarela especial"); 
				ingrediente.put(2,"rodelas de tomate");
				ingrediente.put(2,"or�gano");
				ingrediente.put(2,"azeitonas pretas");
				ingrediente.put(3,"Molho de tomate fresco");
				ingrediente.put(3,"calabresa especial fatiada");
				ingrediente.put(3,"rodelas de cebola");
				ingrediente.put(3,"or�gano");
				ingrediente.put(3,"azeitonas pretas");
				ingrediente.put(4,"Molho de tomate fresco");
				ingrediente.put(4,"calabresa mo�da levemente apimentada");
				ingrediente.put(4,"ovos cozidos picados");
				ingrediente.put(4,"cebola fatiada");
				ingrediente.put(4,"or�gano");
				ingrediente.put(4,"azeitonas pretas");	
				ingrediente.put(5,"Molho de tomate fresco");
				ingrediente.put(5,"peito de frango desfiado levemente temperado");
				ingrediente.put(5,"coberto com catupiry");
				ingrediente.put(5,"or�gano");
				ingrediente.put(5,"azeitonas pretas");			
				ingrediente.put(6,"Molho de tomate fresco");
				ingrediente.put(6,"mussarela especial"); 
				ingrediente.put(6,"rodelas de tomate");
				ingrediente.put(6,"queijo parmes�o");
				ingrediente.put(6,"or�gano");
				ingrediente.put(6,"azeitonas pretas");
				ingrediente.put(7,"Molho de tomate fresco");
				ingrediente.put(7,"palmito macio em rodelas");
				ingrediente.put(7,"coberto com catupiry");
				ingrediente.put(7,"or�gano");
				ingrediente.put(7,"azeitonas pretas");

			
				boolean achou = false;


				StringTokenizer palavras = new StringTokenizer(resposta, " ");
				
				while(palavras.hasMoreTokens()) {
					String palavra = palavras.nextToken();
					
					System.out.println(palavra);
					
					int index = Collections.binarySearch(ofensas, palavra);
					 
					if (index >= 0) {
					    palavra = ofensas.get(index);
						mensagem = palavra + " � voc�, seu " + palavra;
						break;
					}
					
					index = Collections.binarySearch(saudacao, palavra);
					 
					if (index >= 0) {
					    palavra = ofensas.get(index);
						mensagem = "ol� em que posso te ajudar?";
						break;
					}
					
					index = Collections.binarySearch(despedida, palavra);
					 
					if (index >= 0) {
					    palavra = ofensas.get(index);
						mensagem = "At� mais, amigo";
						break;
					}
					
					if (palavra.contains("custa")) {
						achou = true;
					}
					
					if (achou) {
						for (int i = 0; i < pizzas.size(); i++) {
							if (pizzas.get(i).getNome().equals(palavra)) {
								mensagem = "A pizza de " + palavra + " custa R$ " + pizzas.get(i).getPreco();
							}

						}
					}else {
							mensagem = "Infelizmente n�o temos a op��o " + palavra;							
					}
				
				}
	
				
				sendResponse = bot.execute(new SendMessage(update.message().chat().id(), mensagem));
				// verifica��o de mensagem enviada com sucesso
				System.out.println("Mensagem Enviada?" + sendResponse.isOk()); //confirma
			}
		}}

}
