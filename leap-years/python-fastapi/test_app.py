from app import app
from fastapi.testclient import TestClient

def test_should_get_valid_response():
    with TestClient(app) as client:
        response = client.get('/')
        assert response.json() == 43
