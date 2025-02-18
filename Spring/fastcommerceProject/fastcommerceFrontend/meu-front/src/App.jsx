import React, { useState } from 'react';

// Componente principal da aplicação
function App() {
  const [clientId, setClientId] = useState('');  // Armazena o ID do cliente
  const [client, setClient] = useState(null);    // Armazena os dados do cliente
  const [error, setError] = useState(null);      // Armazena erros, caso aconteçam

  // Função para buscar cliente pelo ID
  const buscarCliente = async () => {
    try {
      const response = await fetch(`http://localhost:8080/clientes/${clientId}`);
      if (!response.ok) {
        throw new Error('Cliente não encontrado');
      }
      const data = await response.json();
      setClient(data);  // Atualiza o estado com os dados do cliente
      setError(null);    // Reseta o erro
    } catch (err) {
      setClient(null);    // Reseta os dados do cliente
      setError(err.message);  // Exibe a mensagem de erro
    }
  };

  return (
    <div className="app-container">
      <h1>Buscar Cliente</h1>
      <div className="search-box">
        <input
          type="text"
          placeholder="Digite o ID do cliente"
          value={clientId}
          onChange={(e) => setClientId(e.target.value)}  // Atualiza o estado com o valor do input
        />
        <button onClick={buscarCliente}>Buscar</button>
      </div>

      {error && <p style={{ color: 'red' }}>{error}</p>}  {/* Exibe mensagem de erro */}
      
      {client && (
        <div className="client-info">
          <h2>Dados do Cliente</h2>
          <p>ID: {client.id}</p>
          <p>Nome: {client.nome}</p>
          <p>Email: {client.email}</p>
        </div>
      )}
    </div>
  );
}

export default App;
