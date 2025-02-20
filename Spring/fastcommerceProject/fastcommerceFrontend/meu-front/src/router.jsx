import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Sobre from './pages/sobre'
import Home from './pages/home'

export default function AppRouter() {
    return (
        <>
            <BrowserRouter>
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/sobre" element={<Sobre />} />
                </Routes>
            </BrowserRouter>
        </>
    )
}