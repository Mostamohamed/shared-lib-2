def call(int n = 1) {
    sh """
        echo "🔧 Running worker ${n} on master"
        python3 main.py ${n}
    """
}