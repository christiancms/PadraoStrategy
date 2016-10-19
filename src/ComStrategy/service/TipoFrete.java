package ComStrategy.service;

import ComStrategy.service.frete.Buscarape;
import ComStrategy.service.frete.Normal;
import ComStrategy.service.frete.Sedex;

public enum TipoFrete {
	
	NORMAL {
		// cria a instância da classe chamada "normal"
		@Override
		public Frete obterFrete() {
			return new Normal();
		}
	},
	SEDEX {
		// cria a instância da classe chamada "sedex"
		@Override
		public Frete obterFrete() {
			return new Sedex();
		}
	},
	BUSCARAPE {
		// cria a instância da classe chamada "buscarape"
		@Override
		public Frete obterFrete() { return new Buscarape(); }
	};

	// o método deve ser implementado onde for invocado
	public abstract Frete obterFrete();
}
