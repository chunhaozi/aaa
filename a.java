
		cin.close();
		int max=sum[0];
		for(int j=0;j<i;j++) {
			if(max<sum[j]) {
				f=j;
			}
		}
		System.out.println(n[f]);
	}
}
