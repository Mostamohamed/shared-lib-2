def call(int n = 1) { 
    sh """
        echo "🔧 Running worker ${n} on master"
        python3 -m venv .venv || true
        . .venv/bin/activate
        pip install -r requirements.txt
        python3 word_counter.py input.txt output_${n}.txt
    """
}
