import java.util.Scanner;
public class Main {

    public static void opcaoVoltar(){
        int voltar = 0;
        do{
        Scanner ler = new Scanner(System.in);
        System.out.println("\nVocê deseja voltar para o menu, ou quer desligar o programa?");
        System.out.println("- Digite 1 para voltar" +
                "\n- Digite 0 para desligar");
        voltar = ler.nextInt();

        if(voltar == 0) {
            System.out.println("O Banco Central agradece!");
            System.out.println("Sistema Finalizado. Volte sempre");
            System.exit(0);
            }
        else if(voltar == 1){
        }
        else {
            System.out.println("Número inválido!");
        }
        }while (voltar != 1);
    }
    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);
        System.out.println("Olá Usuário, me chamo Brena, sou a assistencia virtual do Banco Cental e irei te ajudá-lo");
        System.out.println("Nesse programa iremos falar sobre golpes");
        int opcao = 0;

        do {
            System.out.println("\n                    MENU DE OPÇÕES                            ");
            System.out.println("\n1 - Atuação do Banco Central na prevenção de golpes e fraudes\n" +
                    "2 - Dicas gerais para evitar golpes\n" +
                    "3 - Vítima fez um pix e caiu em um golpe\n" +
                    "4 - Vítima do golpe do ''presente''\n" +
                    "5 - Vítima fez uma TED e caiu em um golpe\n" +
                    "6 - Vítima fez compra com cartão e caiu em um golpe\n" +
                    "7 - Vítima pagou um boleto e caiu em um golpe\n" +
                    "8 - Banco do golpista detecta que não há dinheiro na conta dele\n" +
                    "9 - Vítima não reconhece uma compra com seu cartão\n" +
                    "10 - Vítima não reconhece uma compra em maquiniha de cartão\n" +
                    "11 - Vítima caiu no golpe do falso entregador/motoboy\n" +
                    "12 - Cuidado com ligações de falsas centrais de atendimento\n" +
                    "13 - Golpes envolvendo Valores a Receber\n" +
                    "14 - Medidas para evitar golpes envolvendo empréstimo\n" +
                    "15 - Golpes envolvendo o nome do Banco Central\n" +
                    "16 - Golpes envolvendo mensagem Swift ou títulos do Tesouro\n" +
                    "17 - Golpes contra a prefeituras\n" +
                    "18 - Golpes envolvendo o Meu BC\n" +
                    "0 - Desligar o programa\n");
            System.out.print("Qual opção você deseja: ");
            opcao = ler.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("\nPerfeito, você quer saber como nós do Banco Central previnimos golpes e fraudes, vamos lá!\n ");
                    System.out.println("- Garantir que, ao abrir uma conta, haja procedimentos e controles para verificar a identidade do cliente e a autenticidade das suas informações;\n" +
                            "- Buscar a integridade, a confiabilidade, a segurança e o sigilo das transações realizadas na contratação de operações e na prestação de serviços; e\n" +
                            "- Implementar a política de segurança cibernética para o processamento e armazenamento de dados dos clientes.\n");

                    opcaoVoltar();
                    break;

                case 2:
                    System.out.println("\nCerto, você quer dicas gerais para evitar golpes!\n ");
                    System.out.println("- Não transferir dinheiro a pedido de conhecidos enviado por aplicativos de mensagens (WhatsApp ou Telegram, por exemplo),\n" +
                            "principalmente para a conta de outra pessoa que não é conhecida. É indicado telefonar antes ou encontrar a pessoa,\n" +
                            "confirmando se ela realmente fez o pedido, pois também há vídeos e áudios feitos com uso de inteligência artificial que\n" +
                            "simulam a voz e imagem de pessoas;");
                    System.out.println("- Não aceitar ajuda de estranhos para pagar contas, sacar dinheiro ou fazer outra operação em caixa eletrônico. Pedir ajuda\n" +
                            "somente a funcionários do banco, que devem estar identificados com crachá e uniforme com o nome do banco;");
                    System.out.println("- Desconfiar de promessas de herança, doação ou prêmios em moeda estrangeira (dólar, por exemplo) e não transferir dinheiro\n" +
                            " para o exterior para receber um valor prometido;");
                    System.out.println("- Não fornecer o cartão ou senha a outras pessoas, mesmo que conhecidas;");
                    System.out.println("- Se ainda tiver dúvidas, consultar os canais oficiais do seu banco.\n");

                    opcaoVoltar();
                    break;

                case 3:
                    System.out.println("\nSe você caiu em um golpe, o primeiro passo é avisar seu banco e pedir o estorno do valor transferido para o golpista. \n" +
                            "Também é importante registrar um Boletim de Ocorrência na polícia.");
                    System.out.println("\nO processo funciona assim:\n" +
                            "1. O banco da vítima registra a infração e inicia o Mecanismo Especial de Devolução (MED) do Pix.\n" +
                            "2. O banco do golpista bloqueia os valores.\n" +
                            "3. Ambas as instituições analisam o caso em até 7 dias para verificar se houve fraude.\n" +
                            "4. Se confirmada a fraude, o banco do golpista devolve o dinheiro à vítima em até 96 horas.");
                    System.out.println("\nSe não resolver, você pode:\n" +
                            " - Buscar ajuda no Procon ou no Judiciário.\n" +
                            "- Registrar uma reclamação no Banco Central. O banco do golpista será notificado e monitorará a conta em busca de transações suspeitas.\n");
                    System.out.println("Lembre-se: o MED só funciona em casos de fraude, não em desacordos comerciais, como o envio errado de um produto por um vendedor honesto.");
                    System.out.println("Atenção! Se alguém alegar que fez um Pix por engano na sua conta, cheque seu extrato.\n" +
                            "Se o depósito existir, use a funcionalidade de devolução do Pix, pois o valor voltará diretamente para a conta do pagador.\n" +
                            "Não aceite devolver o dinheiro para outra conta, isso pode ser um golpe para tentar obter dinheiro duplicado.");

                    opcaoVoltar();
                    break;

                case 4:
                    System.out.println("\nVítima recebeu uma oferta de um produto como, por exemplo, uma cesta básica, uma renda extra de INSS ou um brinde ou um\n" +
                            "presente. O golpista pede dados pessoais ou foto do seu rosto (selfie), alegando que a informação serve para finalizar a entrega ou\n" +
                            "confirmar um cadastro. Com esses dados, o golpista abre conta ou contrata empréstimo por meio de reconhecimento facial.\n");
                    System.out.println("A vítima desse golpe deve entrar em contato imediatamente com o banco no qual a conta foi aberta ou o empréstimo foi realizado para pedir o cancelamento.\n");
                    System.out.println("Caso você desconheça o banco que foi utilizado para o golpe, você pode solicitar a emissão do Relatório de Contas e\n" +
                            "Relacionamentos em bancos (CCS), pelo Sistema Registrato.\n");
                    System.out.println("Se a situação não for resolvida, a vítima pode:");
                    System.out.println("- Procurar o Procon de seu estado ou o Poder Judiciário; ou\n" +
                            "- Registrar uma reclamação no BC.\n");
                    System.out.println("Em paralelo, é recomendável registrar um Boletim de Ocorrência. Dicas:");
                    System.out.println("- Desconfiar ao receber ligação com ofertas de produtos;\n" +
                            "- Não receber presentes desconhecidos de entregadores em casa;\n" +
                            "- Não permitir que tirem fotos ou façam vídeos; \n");

                    opcaoVoltar();
                    break;

                case 5:
                    System.out.println("\nCaso tenha sido vítima de um golpe, o primeiro passo é a vítima imediatamente entrar em contato com seu banco para relatar o\n" +
                            "caso e solicitar a devolução dos valores transferidos para o suposto golpista.\n");
                    System.out.println("\nEm paralelo, é recomendável registrar um Boletim de Ocorrência, informando os dados do comprovante da transação: ID da\n" +
                            "transação, valor, data/hora da liquidação, descrição (caso preenchida), nome do banco do recebedor, nome do recebedor, CPF ou CNPJ\n");
                    System.out.println("Se a situação não for resolvida, a vítima pode:" );
                    System.out.println("- Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                            "- Registrar uma reclamação no BC.\n");

                    opcaoVoltar();
                    break;

                case 6:
                    System.out.println("\nO primeiro passo é a vítima imediatamente entrar em contato com seu banco para relatar o caso e contestar a compra realizada\n" +
                            "com cartão. Em paralelo, é recomendável registrar um Boletim de Ocorrência.\n");
                    System.out.println("Se a situação não for resolvida, a vítima pode:");
                    System.out.println("- Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                            "- Registrar uma reclamação no BC.\n" );
                    System.out.println("Dicas:\n" +
                            "- Sempre que possível, é importante verificar o extrato de cartão, garantindo que nada fora do habitual será cobrado indevidamente na fatura;\n" +
                            "- Ativar as notificações do aplicativo do cartão para ser avisado sempre que uma nova compra é realizada;\n" +
                            "- Nas compras pela internet, ter cuidado com sites e aplicativos falsos, para fazer o pagamento em um estabelecimento confiável;\n" +
                            "- Desconfiar de preços muito abaixo do mercado;\n" +
                            "- Pesquisar se a loja ou a empresa de leilão realmente existe;\n" +
                            "- Consultar se essas empresas possuem reclamações em sites especializados ou no consumidor.gov.br.\n");

                    opcaoVoltar();
                    break;

                case 7:
                    System.out.println("\nAtualmente, todos os boletos emitidos por bancos são registrados conforme convenção. Isso significa que os dados dos\n" +
                            "beneficiários dos boletos sempre aparecem quando a pessoa vai pagar o boleto e que os boletos podem ser pagos em qualquer banco.\n");
                    System.out.println("Por isso, é importante:");
                    System.out.println("- Ao pagar o boleto, que a pessoa verifique se o nome do beneficiário do pagamento é uma pessoa física ou a empresa\n" +
                            "contratada, e se o banco destinatário é o mesmo que consta no boleto. Se tiver alguma informação diferente, é melhor não\n" +
                            "fazer o pagamento;\n" +
                            "- Desconfiar de código de barras com falhas e evitar ligar no telefone inscrito no boleto, porque pode ser do próprio golpista,\n" +
                            "esperando para passar instruções para pagar diretamente na conta dele;\n" +
                            "- Entrar em contato direto com a prestadora de serviços que deveria gerar o boleto, encontrando seu contato em meios oficiais,\n" +
                            "como sites, por exemplo;\n" +
                            "- Não imprimir o boleto fora do site ou e-mail oficial do serviço que contratou.\n");
                    System.out.println("Se a vítima pagou um boleto indevidamente, o primeiro passo é entrar em contato com seu banco para relatar o caso e contestar a\n" +
                            "compra realizada com cartão. Em paralelo, é recomendável registrar um Boletim de Ocorrência.\n");
                    System.out.println("Se a situação não for resolvida, a vítima pode:");
                    System.out.println("- Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                            "- Registrar uma reclamação no BC.\n");
                    System.out.println("Atenção! Caso o documento apresente um QR Code, esse código é o QR de Pix e o pagamento por meio dele é instantâneo na\n" +
                            "conta destinatária, sem janelas de compensação de boletos (que ocorrem em dias úteis). Na prática, pagar documento com QR\n" +
                            "Code é o mesmo que fazer um Pix.\n");

                    opcaoVoltar();
                    break;

                case 8:
                    System.out.println("\nApós relatar o golpe sofrido, o banco da vítima instaura o Mecanismo Especial de Devolução (MED) do Pix. Comprovada a fraude, o\n" +
                            "banco do suposto golpista devolve os recursos para a vítima em até 96 horas, a contar do término da avaliação.\n");
                    System.out.println("Se não houver saldo suficiente na conta do suposto golpista para efetuar a devolução total dos valores, a instituição dele deve\n" +
                            "monitorar a conta e, surgindo recursos na conta, efetuar devoluções parciais (em até 90 dias). O banco da vítima não é obrigado a\n" +
                            "utilizar recursos próprios para devolver o montante transferido na transação original.\n");
                    System.out.println("Após o prazo de 90 dias sem que haja recursos na conta do suposto golpista, não há devolução de recursos à vítima por meio do MED.\n");
                    System.out.println("Nessas situações, a vítima pode:");
                    System.out.println("- Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                            "- Registrar uma reclamação no BC.\n");

                    opcaoVoltar();
                    break;
                case 9:
                    System.out.println("\nO primeiro passo é a vítima imediatamente entrar em contato com seu banco para relatar o caso e contestar a compra realizada\n" +
                            "com cartão. Em paralelo, é recomendável registrar um Boletim de Ocorrência. Em alguns casos, os bancos permitem a contestação\n" +
                            "da compra diretamente no extrato da fatura do cartão no internet banking\n");
                    System.out.println("Pode ocorrer também de o próprio banco ligar para os clientes para verificar se eles reconhecem determinadas compras. Caso o\n" +
                            "cliente informe que não reconhece a compra, o banco não processa o pagamento.\n");
                    System.out.println("Atenção! Em nenhuma hipótese, o banco pede para o cliente realizar alguma ação no internet banking ou no caixa eletrônico para\n" +
                            "sustar ou impedir uma compra. Esse tipo de pedido é comum em golpe da falsa central de atendimento.\n");
                    System.out.println("Se a situação não for resolvida, a vítima pode:");
                    System.out.println("- Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                            "- Registrar uma reclamação no BC.\n");

                    opcaoVoltar();
                    break;
                case 10:
                    System.out.println("\nCaso não reconheça determinada compra feita em maquininha de cartão, recomenda-se conversar com o lojista ou entrar emcontato com o banco.\n");
                    System.out.println("Se a situação não for resolvida, a vítima pode:");
                    System.out.println("- Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                            "- Registrar uma reclamação no BC.\n");
                    System.out.println("Dicas:");
                    System.out.println("- Antes de digitar a senha ou de aproximar o cartão para pagar, conferir sempre se o visor da maquininha de cartão está\n" +
                            "funcionando corretamente e se o valor digitado está correto;\n" +
                            "- Desabilitar a função de pagamento por aproximação se não estiver segura com essa funcionalidade.\n");

                    opcaoVoltar();
                    break;
                case 11:
                    System.out.println("\nVítima recebeu ligação falsa do banco dizendo que seu cartão foi clonado e que um motoboy, supostamente autorizado pelo banco, irá\n" +
                            "buscá-lo. O motoboy finge que destrói o cartão, mas mantem seu chip intacto. Também há casos de vítimas que são informadas de que\n" +
                            "receberão um presente em casa e que devem pagar uma taxa ao entregador. Em algumas situações, o suposto entregador pede para\n" +
                            "tirar fotos ou fazer vídeos com a vítima, utilizando esses dados para abertura de contas digitais ou contratação de empréstimo por\n" +
                            "reconhecimento facial.\n");
                    System.out.println("A vítima desse golpe deve entrar em contato imediatamente com seu banco para pedir o cancelamento do cartão. Além disso, se\n" +
                            "pagou alguma taxa, deve pedir ao banco para solicitar o dinheiro de volta.\n");
                    System.out.println("Se a situação não for resolvida, a vítima pode:");
                    System.out.println("- Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                            "- Registrar uma reclamação no BC.\n");
                    System.out.println("Dicas:");
                    System.out.println("- Desconfiar ao receber ligação do banco, dizendo que o cartão foi clonado e que um motoboy, supostamente autorizado pelo\n" +
                            "banco, irá buscá-lo. Mesmo se for em outros casos, inclusive com o cartão bloqueado;\n" +
                            "- Não receber presentes desconhecidos de entregadores em casa;\n" +
                            "- Não efetuar pagamento de taxas de entregas de algo que é desconhecido;\n" +
                            "- Não permitir que tirem fotos ou façam vídeos, pois eles podem ser utilizados para abertura de contas digitais ou contratação de\n" +
                            "empréstimo por reconhecimento facial;\n" +
                            "- Em caso de fraude ou clonagem do cartão, pedir o cancelamento ao banco pelos canais oficiais, triturar o cartão e jogar os restos no lixo;\n" +
                            "- Nunca fornecer a senha a outra pessoa;\n" +
                            "- Sempre pedir comprovante das operações que realiza com cartões.\n");

                    opcaoVoltar();
                    break;

                case 12:
                    System.out.println("\nDesconfie de ligações ou mensagens recebidas nas quais a pessoa se identifica como sendo funcionário(a) do banco e:");
                    System.out.println("- Solicita que o cliente que atendeu o telefone entre no aplicativo instalado no seu aparelho e execute procedimentos de\n" +
                            "segurança (em geral, eles enviam links ou documentos por e-mail, SMS ou WhatsApp informando sobre compras suspeitas ou\n" +
                            "com orientações de segurança);\n" +
                            "- Envia e-mails para o cliente clique em links ou documentos; ou\n" +
                            "- Pede que o cliente efetue o cancelamento de uma compra ou boleto, quando, na verdade, a pessoa/cliente está efetuando o pagamento.\n");
                    System.out.println("Com esses artifícios, os golpistas conseguem invadir o celular/aplicativo e contratar operações, realizar saques de valores, pagar\n" +
                            "faturas entre outras transações.\n");
                    System.out.println("Se receber uma ligação ou mensagem/e-mail desses ou semelhante, não realize nenhum procedimento, ligue para seu gerente ou\n" +
                            "entre em contato com os canais oficiais do seu banco para confirmar a informação.\n");

                    opcaoVoltar();
                    break;

                case 13:
                    System.out.println("\nO único site para saber informações sobre Valores a Receber, inclusive de pessoas falecidas, é https://valoresareceber.bcb.gov.br. Esse serviço é gratuito.\n");
                    System.out.println("O Banco Central não envia links nem entra em contato com ninguém para tratar sobre valores a receber ou para confirmar dados\n" +
                            "pessoais. Somente a instituição que aparece na consulta aos valores a receber que pode contatar seu cliente, principalmente no caso\n" +
                            "de pedido de resgate de valores sem indicar uma chave Pix. Mas ela nunca irá pedir os dados pessoais ou sua senha.\n");
                    System.out.println("Dicas:");
                    System.out.println("- NÃO clicar em links suspeitos enviados por e-mail, SMS, WhatsApp ou Telegram;\n" +
                            "- NÃO fazer qualquer tipo de pagamento para ter acesso aos valores;\n" +
                            "- NÃO existe a opção de receber algum valor pelo uso de cartões de crédito. Não há lei ou norma do BC sobre recall de cartões de crédito.\n");

                    opcaoVoltar();
                    break;

                case 14:
                    System.out.println("\n- Não fazer pagamento antecipado para receber empréstimos, principalmente para conta de pessoa física;\n" +
                            "- Desconfiar de ofertas muito abaixo do mercado ou que não façam as exigências comuns em outros bancos;\n" +
                            "- Contratar empréstimo, financiamento ou consórcio com instituição autorizada pelo Banco Central;\n" +
                            "- Desconfiar se a empresa não fizer consultas ao SPC e à Serasa, por exemplo;\n" +
                            "- Desconfiar de links com ofertas de empréstimo ou pedidos de atualização de cadastro encaminhados por SMS, Whatsapp e\n" +
                            "e-mail ou postados em redes sociais.");
                    System.out.println("É recomendável que o cliente ligue para o gerente ou entre em contato com os canais oficiais do banco para confirmar qualquer\n" +
                            "informação sobre o assunto.\n");

                    opcaoVoltar();
                    break;

                case 15:
                    System.out.println("\nO Banco Central:");
                    System.out.println("- Não faz cobrança de dívidas, taxas, transferências ou pagamento de cheques sem fundos;\n" +
                            "- Não pede senhas, dados bancários, informações pessoais, cadastramento nem recadastramento em sistemas.\n");
                    System.out.println("Dicas:");
                    System.out.println("- Não fazer pagamento sem ter certeza da dívida;\n" +
                            "- Entrar em contato com o banco onde a dívida foi feita ou que forneceu o cheque;\n" +
                            "- Desconfiar se receber ligações de suposto funcionário do BC. O Banco Central só liga para alguém se a pessoa tiver entrado em contato antes;\n" +
                            "- Consultar os Relatórios de Empréstimos e Financiamentos e de Cheques Sem Fundos pelo Registrato;\n" +
                            "- Em caso de dúvidas, entrar em contato pelo Fale conosco do BC.\n");

                    opcaoVoltar();
                    break;

                case 16:
                    System.out.println("\nOs proponentes desse esquema costumam mencionar:");
                    System.out.println("- Que o BC controla contas bancárias de cidadãos ou empresas que podem ser acessadas através do envio de mensagens Swift\n" +
                            "(meio padronizado de telecomunicação usado por instituições financeiras em todo o mundo); e\n" +
                            "- Supostos títulos e documentos relativos às Letras do Tesouro Nacional (LTN), utilizados como garantia em operações financeiras falsas.\n");
                    System.out.println("Além disso, fazem uso de documentos falsos que:");
                    System.out.println("- Contêm termos como \"Resgate\", \"Aceitação de Valor\" ou \"Carta de Crédito Padrão\";\n" +
                            "- Parecem legítimos e comumente são chamados de \"títulos promissórios\", \"títulos de indenização\", \"títulos de compensação\",\n" +
                            "\"minutas à vista\" ou \"mandados de controladoria\"; e\n" +
                            "- Mencionam mensagens SWIFT fraudulentas que, frequentemente, misturam terminologia jurídica, nomes de cartórios e\n" +
                            "autoridades, inclusive do BC, na tentativa de fazer com que a fraude pareça legítima.\n");
                    System.out.println("Dessa forma, o BC destaca:");
                    System.out.println("- As mensagens SWIFT não são utilizadas pelo BC para reconhecimento de crédito ou como garantia em operações financeiras\n" +
                            "envolvendo pessoas físicas ou jurídicas;\n" +
                            "- A lei atual proíbe o BC de emitir títulos públicos;\n" +
                            "- Todos os títulos emitidos pelo Tesouro Nacional são negociados e mantidos eletronicamente e não existem no papel (logo,\n" +
                            "documentos físicos apresentados nas tentativas de fraude não representam dívidas do BC nem dívidas do governo brasileiro); e\n" +
                            "- Que não emite documentos como \"Certidão Conjunta de Valor Atualizado\", \"Certificado de Repactuação\", \"Declaração de\n" +
                            "Autenticidade\" ou \"Autorização para transporte de ativo financeiro\".\n");
                    System.out.println("Atenção! Mais informações sobre alertas de fraude relacionados a títulos públicos podem ser obtidas em na página do Tesouro Nacional.\n");
                    System.out.println("Os casos envolvendo fraudes estão sob investigação da Polícia Federal.\n");

                    opcaoVoltar();
                    break;

                case 17:
                    System.out.println("\n- Só juízes e tribunais podem pedir o bloqueio ou o desbloqueio de valores e/ou contas bancárias;\n" +
                            "- O Banco Central não pode sustar ou atrasar o cumprimento de ordens judiciais e não faz contatos pessoais ou telefônicos para isso;\n" +
                            "- Caso uma prefeitura receba mensagens desse tipo, é recomendável que ela entre em contato com o órgão do Poder Judiciário\n" +
                            "que emitiu a ordem e com as autoridades policiais.\n");

                    opcaoVoltar();
                    break;

                case 18:
                    System.out.println("\nNa área logada do Meu BC você encontra os relatórios do Registrato, o sistema Valores a Receber e muito mais.\n" +
                            "O acesso à área logada do Meu BC é exclusivamente pela página https://www.bcb.gov.br/meubc.\n" +
                            "Todos os serviços do Banco Central para a população são totalmente gratuitos.\n");
                    System.out.println("O Banco Central não usa advogados nem outros intermediários, não envia links e nem entra em contato para tratar sobre devolução\n" +
                            "de valores ou para confirmar dados pessoais.\n");
                    System.out.println("Dicas:");
                    System.out.println("- NUNCA realize qualquer tipo de pagamento para ter acesso aos serviços do Banco Central;\n" +
                            "- CUIDADO com páginas falsas, todos os serviços do Banco Central estão no site oficial https://www.bcb.gov.br/;\n" +
                            "- NÃO clique em links suspeitos enviados por e-mail, SMS, WhatsApp ou Telegram;\n");
                    opcaoVoltar();
                    break;
            }
            if (opcao > 18 || opcao<0){
                System.out.println("Você digitou uma número inválido inválido");
                opcaoVoltar();
            }
        }while (opcao!= 0);
        System.out.println("Sistema Finalizado. Volte sempre");
    }
}
