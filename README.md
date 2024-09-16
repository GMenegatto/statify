
# Statify | Spotify API study

Este é um projeto de estudos utilizando Spring Boot e a api do Spotify para mostrar dados de músicas em alta, músicas mais escutadas do usuário e etc.




## Layout

![App Screenshot](https://media.discordapp.net/attachments/1226000361366487142/1284567497856651294/statify.PNG?ex=66e71a35&is=66e5c8b5&hm=06ee3eed3f2b4c64680b0da15c6c085ce23b7d6082a50d178a94e8c3ba0a2fe0&=&format=webp&quality=lossless&width=720&height=404)

## Tecnologias Utilizadas
- Java com Spring Boot
- Spotify API
- Futuro: PostgreSQL para persistência de dados
- Frontend em desenvolvimento

## Como Rodar o Projeto

Para rodar este projeto, você precisa configurar as seguintes variáveis de ambiente:

- `SPOTIFY_CLIENT_ID`: ID do cliente gerado no [Spotify Developer Dashboard](https://developer.spotify.com/dashboard/applications)
- `SPOTIFY_CLIENT_SECRET`: Secret do cliente gerado no [Spotify Developer Dashboard](https://developer.spotify.com/dashboard/applications)

Essas variáveis de ambiente podem ser configuradas no seu sistema operacional ou diretamente no arquivo de configuração da sua IDE.

### Exemplo de Configuração no Sistema
```bash
export SPOTIFY_CLIENT_ID="sua_client_id"
export SPOTIFY_CLIENT_SECRET="seu_client_secret"
````

## TODO
- [x] Integrar Angular
- [ ] Integrar PostgreSQL
- [ ] Integrar sistema de login
- [ ] Implementar autenticação
- [ ] Desenvolver o frontend
- [ ] Criação das APIs
- [ ] Configurar Kubernetes