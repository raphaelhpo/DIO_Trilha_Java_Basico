import Forms from "../components/forms"
import Sobre from "./sobre"

export default function Home() {
    return (
        <>
            <div>
                <p className="text-center"><a href="/sobre">Sobre</a></p>
                <Forms />
            </div>
        </>
    )
}