package com.digital.wallet.services;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.digital.wallet.models.ConfirmationToken;

public interface ConfirmationTokenService {
	
	public void save(ConfirmationToken token);
	public ResponseEntity<String> verifyToken(String token);
}
