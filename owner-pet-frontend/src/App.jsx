import { useState, useEffect } from 'react'
import axios from 'axios'

function App() {
  const [ownerId, setOwnerId] = useState('')
  const [ownerData, setOwnerData] = useState(null)
  const [error, setError] = useState(null)

  const handleSearch = async () => {
    try {
      const response = await axios.get('http://localhost:8080/owners/with-pets') // 8080 = puerto del Gateway
      const owner = response.data.find(o => o.id === parseInt(ownerId))
      if (owner) {
        setOwnerData(owner)
        setError(null)
      } else {
        setOwnerData(null)
        setError('Dueño no encontrado.')
      }
    } catch (err) {
      console.error(err)
      setError('Error al consultar el servidor.')
    }
  }

  return (
    <div style={{ padding: '2rem', fontFamily: 'Arial' }}>
      <h2>Buscar Mascotas por ID de Dueño</h2>
      <input
        type="number"
        placeholder="Ingrese ID del dueño"
        value={ownerId}
        onChange={e => setOwnerId(e.target.value)}
      />
      <button onClick={handleSearch}>Buscar</button>

      {error && <p style={{ color: 'red' }}>{error}</p>}

      {ownerData && (
        <div style={{ marginTop: '1rem' }}>
          <h3>{ownerData.name}</h3>
          <p>Teléfono: {ownerData.phone}</p>
          <h4>Mascotas:</h4>
          <ul>
            {ownerData.pets.map(pet => (
              <li key={pet.id}>
                {pet.name} - {pet.breed} - {pet.age} años
              </li>
            ))}
          </ul>
        </div>
      )}
    </div>
  )
}

export default App
