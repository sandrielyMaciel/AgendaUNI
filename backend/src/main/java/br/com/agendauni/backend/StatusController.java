import { useState } from 'react'
import './App.css'

function App() {
  const [pagina, setPagina] = useState('eventos')

  return (
    <div className="app">
      <header className="cabecalho">
        <div className="marca">
          <div className="marca-icone">E</div>
          <div>
            <h1>Eventos Acadêmicos</h1>
            <p>Sistema de gerenciamento de eventos</p>
          </div>
        </div>

        <nav>
          <button
            className={pagina === 'eventos' ? 'ativo' : ''}
            onClick={() => setPagina('eventos')}
          >
            Eventos
          </button>

          <button
            className={pagina === 'solicitar' ? 'ativo' : ''}
            onClick={() => setPagina('solicitar')}
          >
            Solicitar evento
          </button>

          <button
            className={pagina === 'login' ? 'ativo' : ''}
            onClick={() => setPagina('login')}
          >
            Entrar
          </button>
        </nav>
      </header>

      <main className="conteudo">
        {pagina === 'eventos' && (
          <section>
            <p className="sobretitulo">AGENDA ACADÊMICA</p>
            <h2>Eventos da instituição</h2>
            <p className="descricao">
              Confira os próximos eventos acadêmicos.
            </p>

            <div className="vazio">
              <h3>Nenhum evento disponível</h3>
              <p>
                Os eventos aprovados aparecerão aqui.
              </p>
            </div>
          </section>
        )}

        {pagina === 'solicitar' && (
          <section>
            <p className="sobretitulo">NOVA SOLICITAÇÃO</p>
            <h2>Solicitar um evento</h2>
            <p className="descricao">
              Em breve, você poderá preencher e enviar
              uma solicitação de evento por aqui.
            </p>
          </section>
        )}

        {pagina === 'login' && (
          <section>
            <p className="sobretitulo">ACESSO AO SISTEMA</p>
            <h2>Entrar</h2>
            <p className="descricao">
              Em breve, o acesso será feito com sua conta
              cadastrada no sistema.
            </p>
          </section>
        )}
      </main>

      <footer>
        Sistema de Gerenciamento de Eventos Acadêmicos
      </footer>
    </div>
  )
}

export default App