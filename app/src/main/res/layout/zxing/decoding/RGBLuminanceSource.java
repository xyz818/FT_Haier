�}�  �  �!��n��� �a	��Lm#�>���,�^mYj�`	iL�'�jo�5�CK���E���s�	�M[r�+^�&#��a�΅�eЁ�?��my���܃w�U�P���E���M�X��!��"�>&f�����a#�Ր	���V�T
wf��2��y�K�H��U#>yPP�
�|�-Trb�#_3�a�uԂ]TH��f���p�?(t�	w�&[�r�R�j��aS��:�Z�f�6S���z:�!Z�j����TM�"�a4Z���|fI���@&�Q���sC�|D>�J��B�,�՘�����׬���?9'뫽�XX�2w�0�2�U�}��hV�8��J��yM�9���?j���Qd�ɹM$g&��7�$��r�p�*�ɦ���4o[�k��Ď�+��u^�$�j�(Jw�RÃ��|�2�^ޟ֧�>z�b[G�P���xta��چ&�Ъ(�٢`5�������,B;���YH�,�0��>�?�l�(p>�E ��۶��� �� �:�|l �L�y�a�g+����⥄P�4m�*wDT|�EI���(Y���#�����̴S�,�m���"�E^k��c��w���b�͠z*R���yBsr~,�;?����޾ׅ_׈Eڴߑ��{6v������+��h5����,y����m��Nc���Z�h&��U�ʽ��O�G�;Q~��?�Q��j��E��;WB��uZY80B���?��OW��3)����Ѯ@�ȅxٲ���-n��}0��f��OG�Q�CW�CP}��&�:J�"�}�ڊ������S�ud|�/hP���6��5�����N�6�O��2f��?�P�.}6j���)I:K�G�S��*�g����b^wA������l�|�)�c���y��Ɇ|ٻ��y�c�����c��D5����]���Q�7�ٌs���èp�D�<Π>w� &[4��.�>Bs�����3YW�A���I,��]��1W�������.����l�*��TwL��9A�Y���S3����|����`j��
dN=�� O\���KV��ַ;zo�����K�c�]�8,�ܶ��ioJ��}?�)'�(����r��G�z9�Y�$�Ԥvq��*����
c���J�����q�,�M�[��?�e��?�)e�+~\�z�����]�!����\-���?!q����Y���h�7�oS5�މ�9X&���ʐ�4�[[1�p|������^k�C�f���lk��p�濢ر@�{Z 2����}C�؁W
x��(��e��:bW#"? kR3� H�]8����{�X�Mo3�]�!�Q�4�ZA-��lmn��3G������nLT��K�:]/9���[Z])��ڡ���W�ϥ�����j����kͯ���s^m;9e0�ػ�7�Q�q>D{�}� hf�Y#+�����`�9�#��+gw���Hj4a�����5Hp�Ro镦P��c���G�.K��1V!�X�r�Y�(����&�l�+���U�qѳW�+�Z�����o4�C'\@�x��e�]N!���)��ji>��|��s�~H�	�g=��D�o���S��ݭ,h���@;��A�[��i�)wz�v4� D���?*�B?�Wec,Ve��Ļ���bP�FQ���;��Q���q{�]d� `E[gf����P%��U���s�kEP�k�j�xls�H��7.�J�*[���w��qi��'R.�"FM�eK����&n����G35=x��x�Cֽ��&��бz5�?t��"��F�Qr2 �^y�S��^�h�h�|{y����,�5�s1�J�ǂ�����-t�6���#�����LwSuY��ȳx��4���KlsvaWh���t�k�B�Vߺ.5z�9e�A��]�Z�8i6��Ոy����@P��������ۓfj*Lr���Ѿ�g����^f�܋���h��Q�";U��"�Bq�r�IV���u���.*'լ*^�/Ϋ�H���@��~�-lD2��֣�s�-p��d�5�=������d���.ys�^�
_��%�&�f��O��޵E�)�o�S���픅ڙrn!#� "x�ϭ�N�c������X*�A����RGnp��
M���y�W��U������ Be�v����yC?C�Fnr����u�h�!|��&DK�m�P�T2�p6�¾q�l�|����d�1��J�q�b!���K�٪�{�Q'N"k�d��Ws�'��(�PXHf�-c�^��)���/��YU{���B� ��uj��,PZ�`
DJͶ,���t��:�	"J��Ű��c�(��%"/��(���nc�F�"=9R�*��|�4�n�	���;AF�	<m�4���Q�K�Z��&��k��;��[R_7F.kfKP�	�jw�����[B �g	Î���w�	|��
�פ�͋����Bl{ �;�G��$|�Bb���cQ�)�V�B@��MtUNx�ɠ�wi"� Y�^�a�@jnderlying byte array
	// already contains
	// exactly what the caller is asking for, so give it to them without a copy.
	@Override
	public byte[] getMatrix() {
		return luminances;
	}

	private static Bitmap loadBitmap(String path) throws FileNotFoundException {
		Bitmap bitmap = BitmapFactory.decodeFile(path);
		if (bitmap == null) {
			throw new FileNotFoundException("Couldn't open " + path);
		}
		return bitmap;
	}

}
