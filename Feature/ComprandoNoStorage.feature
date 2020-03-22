# language: pt

@ComprarItem
Funcionalidade: Comprar um item no site especificado
  
  Usuario deve fazer uma compra no advantage online shopping

  Contexto:
  Dado que estou no site advantage online shopping 
  Quando o usuario estiver logado
  
  Cenario: Compra efetuada com sucesso
  
  E usuario escolhe item desejado
  Quando usuario vai a tela de pagamento 
  Então usuario conclui a compra com sucesso
  
  Cenario: Falha em comprar mais de dez itens 
  
  E usuario escolhe produto
  Então usuario vai a tela de pagamento com menos produtos que o requerido
  
  
  
  